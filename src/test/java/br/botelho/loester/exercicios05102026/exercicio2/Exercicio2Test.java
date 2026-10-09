package br.botelho.loester.exercicios05102026.exercicio2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes para verificar as estações do ano")
class Exercicio2Test {

    // Should / When / Then
    // Deve / Quando / Então

    @Test
    @DisplayName("Deve retornar verão quando a estação for 1")
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
    @DisplayName("Deve retornar outono quando a estação for 2")
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
    @DisplayName("Deve retornar inverno quando a estação for 3")
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
    @DisplayName("Deve retornar primavera quando a estação for 4")
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
    @DisplayName("Deve lançar exceção quando a estação for menor que 1")
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
    @DisplayName("Deve lançar exceção quando a estação for maior que 4")
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