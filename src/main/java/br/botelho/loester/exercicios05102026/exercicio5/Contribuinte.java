package br.botelho.loester.exercicios05102026.exercicio5;

import java.math.BigDecimal;
import java.util.List;

public record Contribuinte(
        String nome,
        String cpf,
        String uf,
        BigDecimal rendaAnual
) {

    private static final List<FaixaImposto> TABELA_IMPOSTO = List.of(
            new FaixaImposto(
                    BigDecimal.ZERO,
                    new BigDecimal("4000.00"),
                    BigDecimal.ZERO
            ),
            new FaixaImposto(
                    new BigDecimal("4000.01"),
                    new BigDecimal("9000.00"),
                    new BigDecimal("0.058")
            ),
            new FaixaImposto(
                    new BigDecimal("9000.01"),
                    new BigDecimal("25000.00"),
                    new BigDecimal("0.15")
            ),
            new FaixaImposto(
                    new BigDecimal("25000.01"),
                    new BigDecimal("35000.00"),
                    new BigDecimal("0.275")
            ),
            new FaixaImposto(
                    new BigDecimal("35000.01"),
                    null,
                    new BigDecimal("0.30")
            )
    );

    public BigDecimal calcularImposto() {
        return TABELA_IMPOSTO.stream()
                .filter(faixa -> faixa.aplicaPara(rendaAnual))
                .findFirst()
                .map(faixa -> rendaAnual.multiply(faixa.aliquota()))
                .orElse(BigDecimal.ZERO);
    }

    private record FaixaImposto(
            BigDecimal minimo,
            BigDecimal maximo,
            BigDecimal aliquota
    ) {

        private boolean aplicaPara(BigDecimal renda) {
            boolean maiorOuIgualAoMinimo = renda.compareTo(minimo) >= 0;

            boolean menorOuIgualAoMaximo =
                    maximo == null || renda.compareTo(maximo) <= 0;

            return maiorOuIgualAoMinimo && menorOuIgualAoMaximo;
        }
    }
}