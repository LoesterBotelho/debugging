package br.botelho.loester.exercicios05102026.exercicio1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Exercicio1Test {

    // Convenção Should / When / Then
    // Deve
    // Quando
    // Então

    @Test
    void validarPar() {

        // Arrange
        Integer numero = 8;

        // Act
        Boolean ehParResultado = Exercicio1.ehPar(numero);

        // Assert | AssertJ
        Assertions.assertThat(ehParResultado)
                  .isEqualTo(true);
    }

    @Test
    void validarImpar() {

        // Arrange
        Integer numero = 7;

        // Act
        Boolean ehParResultado = Exercicio1.ehPar(numero);

        // Assert | AssertJ
        Assertions.assertThat(ehParResultado)
                  .isEqualTo(false);
    }
}