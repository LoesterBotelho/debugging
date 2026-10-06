package br.botelho.loester.exercicios05102026.exercicio2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Exercicio2Test {

    // Should / When / Then
    // Deve / Quando / Então

    @Test
    void deveRetornarVeraoQuandoEstacaoForUm() {

        // Arrange
        Integer estacao = 1;

        // Act
        String resultado = Exercicio2.verificarEstacao(estacao);

        // Assert | AssertJ
        Assertions.assertThat(resultado)
                  .isEqualTo("É verão e o tempo está quente.");
    }

    @Test
    void deveRetornarOutonoQuandoEstacaoForDois() {

        // Arrange
        Integer estacao = 2;

        // Act
        String resultado = Exercicio2.verificarEstacao(estacao);

        // Assert | AssertJ
        Assertions.assertThat(resultado)
                  .isEqualTo("É outono.");
    }

    @Test
    void deveRetornarInvernoQuandoEstacaoForTres() {

        // Arrange
        Integer estacao = 3;

        // Act
        String resultado = Exercicio2.verificarEstacao(estacao);

        // Assert | AssertJ
        Assertions.assertThat(resultado)
                  .isEqualTo("É inverno e está frio.");
    }

    @Test
    void deveRetornarPrimaveraQuandoEstacaoForQuatro() {

        // Arrange
        Integer estacao = 4;

        // Act
        String resultado = Exercicio2.verificarEstacao(estacao);

        // Assert | AssertJ
        Assertions.assertThat(resultado)
                  .isEqualTo("É primavera.");
    }

    @Test
    void deveLancarExcecaoQuandoEstacaoForMenorQueUm() {

        // Arrange
        Integer estacao = 0;

        // Act + Assert | AssertJ
        Assertions.assertThatThrownBy(
                () -> Exercicio2.verificarEstacao(estacao)
        )
        .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void deveLancarExcecaoQuandoEstacaoForMaiorQueQuatro() {

        // Arrange
        Integer estacao = 5;

        // Act + Assert | AssertJ
        Assertions.assertThatThrownBy(
                () -> Exercicio2.verificarEstacao(estacao)
        )
        .isInstanceOf(IllegalArgumentException.class);
    }
}