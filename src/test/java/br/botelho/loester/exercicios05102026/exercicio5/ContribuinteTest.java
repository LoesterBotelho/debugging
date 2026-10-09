package br.botelho.loester.exercicios05102026.exercicio5;

import java.math.BigDecimal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Testes de cálculo do imposto de renda do contribuinte")
class ContribuinteTest {

    @Test
    @DisplayName("Deve calcular imposto de renda com alíquota de 0%")
    void deveCalcularImpostoDeRendaComAliquotaDeZeroPorCento() {
        // Arrange
        Contribuinte contribuinte = new Contribuinte(
                "João da Silva",
                "123.456.789-00",
                "PR",
                new BigDecimal("4000.00")
        );

        // Act
        BigDecimal imposto = contribuinte.calcularImposto();

        // Assert
        assertThat(imposto).isEqualByComparingTo("0.00");
    }

    @Test
    @DisplayName("Deve calcular imposto de renda com alíquota de 5,8%")
    void deveCalcularImpostoDeRendaComAliquotaDeCincoVirgulaOitoPorCento() {
        // Arrange
        Contribuinte contribuinte = new Contribuinte(
                "João da Silva",
                "123.456.789-00",
                "PR",
                new BigDecimal("9000.00")
        );

        // Act
        BigDecimal imposto = contribuinte.calcularImposto();

        // Assert
        assertThat(imposto).isEqualByComparingTo("522.00");
    }

    @Test
    @DisplayName("Deve calcular imposto de renda com alíquota de 15%")
    void deveCalcularImpostoDeRendaComAliquotaDeQuinzePorCento() {
        // Arrange
        Contribuinte contribuinte = new Contribuinte(
                "João da Silva",
                "123.456.789-00",
                "SC",
                new BigDecimal("25000.00")
        );

        // Act
        BigDecimal imposto = contribuinte.calcularImposto();

        // Assert
        assertThat(imposto).isEqualByComparingTo("3750.00");
    }

    @Test
    @DisplayName("Deve calcular imposto de renda com alíquota de 27,5%")
    void deveCalcularImpostoDeRendaComAliquotaDeVinteESeteVirgulaCincoPorCento() {
        // Arrange
        Contribuinte contribuinte = new Contribuinte(
                "João da Silva",
                "123.456.789-00",
                "RS",
                new BigDecimal("35000.00")
        );

        // Act
        BigDecimal imposto = contribuinte.calcularImposto();

        // Assert
        assertThat(imposto).isEqualByComparingTo("9625.00");
    }

    @Test
    @DisplayName("Deve calcular imposto de renda com alíquota de 30%")
    void deveCalcularImpostoDeRendaComAliquotaDeTrintaPorCento() {
        // Arrange
        Contribuinte contribuinte = new Contribuinte(
                "João da Silva",
                "123.456.789-00",
                "PR",
                new BigDecimal("40000.00")
        );

        // Act
        BigDecimal imposto = contribuinte.calcularImposto();

        // Assert
        assertThat(imposto).isEqualByComparingTo("12000.00");
    }
}