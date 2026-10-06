package br.botelho.loester.exercicios05102026.exercicio3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

// Should / When / Then
// Deve / Quando / Então

class Exercicio3Test {

    @Test
    void deveRetornarNomeStarWarsQuandoPessoaForValida() {

        // Arrange
        Pessoa pessoa = new Pessoa(
                "Loester",
                "Gentil",
                "Suave",
                "Floripa"
        );

        // Act
        String nomeStarWars = Exercicio3.gerarNomeStarWars(pessoa);

        // Assert | AssertJ
        Assertions.assertThat(nomeStarWars)
                .isEqualTo("GenLo SuFlo");
    }
}