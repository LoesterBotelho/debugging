package br.botelho.loester.exercicios05102026.exercicio5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import br.botelho.loester.exercicios05102026.exercicio2.Exercicio2;

// Should / When / Then
// Deve / Quando / Então

class Exercicio5Test {

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
    
}
