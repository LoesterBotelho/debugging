package br.botelho.loester.exercicios05102026.exercicio5;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class ContribuinteTest {

    @Test
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