package br.botelho.loester.exercicios05102026.exercicio1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes para verificar se um número é par ou ímpar")
class Exercicio1Test {

    // Convenção Should / When / Then
    // Deve
    // Quando
    // Então

    @Test
    @DisplayName("Deve retornar verdadeiro quando o número for par")
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
    @DisplayName("Deve retornar falso quando o número for ímpar")
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