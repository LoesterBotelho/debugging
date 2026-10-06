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

        // Assert
        Assertions.assertThat(nomeStarWars)
                .isEqualTo("GenLo SuFlo");
    }

    @Test
    void deveLancarExceptionQuandoPessoaForNull() {

        // Act & Assert
        Assertions.assertThatThrownBy(
                        () -> Exercicio3.gerarNomeStarWars(null)
                )
                .isInstanceOf(NullPointerException.class)
                .hasMessage("Pessoa não pode ser null.");
    }

    @Test
    void deveLancarExceptionQuandoNomeForNull() {

        // Arrange
        Pessoa pessoa = new Pessoa(
                null,
                "Gentil",
                "Suave",
                "Floripa"
        );

        // Act & Assert
        Assertions.assertThatThrownBy(
                        () -> Exercicio3.gerarNomeStarWars(pessoa)
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O parâmetro 'nome' não pode ser null ou vazio.");
    }

    @Test
    void deveLancarExceptionQuandoNomeForVazio() {

        // Arrange
        Pessoa pessoa = new Pessoa(
                "",
                "Gentil",
                "Suave",
                "Floripa"
        );

        // Act & Assert
        Assertions.assertThatThrownBy(
                        () -> Exercicio3.gerarNomeStarWars(pessoa)
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O parâmetro 'nome' não pode ser null ou vazio.");
    }

    @Test
    void deveLancarExceptionQuandoNomeForCurto() {

        // Arrange
        Pessoa pessoa = new Pessoa(
                "L",
                "Gentil",
                "Suave",
                "Floripa"
        );

        // Act & Assert
        Assertions.assertThatThrownBy(
                        () -> Exercicio3.gerarNomeStarWars(pessoa)
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O nome deve possuir pelo menos 2 caracteres.");
    }

    @Test
    void deveLancarExceptionQuandoSobrenomeForNull() {

        // Arrange
        Pessoa pessoa = new Pessoa(
                "Loester",
                null,
                "Suave",
                "Floripa"
        );

        // Act & Assert
        Assertions.assertThatThrownBy(
                        () -> Exercicio3.gerarNomeStarWars(pessoa)
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O parâmetro 'sobrenome' não pode ser null ou vazio.");
    }

    @Test
    void deveLancarExceptionQuandoSobrenomeForVazio() {

        // Arrange
        Pessoa pessoa = new Pessoa(
                "Loester",
                "",
                "Suave",
                "Floripa"
        );

        // Act & Assert
        Assertions.assertThatThrownBy(
                        () -> Exercicio3.gerarNomeStarWars(pessoa)
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O parâmetro 'sobrenome' não pode ser null ou vazio.");
    }

    @Test
    void deveLancarExceptionQuandoSobrenomeForCurto() {

        // Arrange
        Pessoa pessoa = new Pessoa(
                "Loester",
                "Ge",
                "Suave",
                "Floripa"
        );

        // Act & Assert
        Assertions.assertThatThrownBy(
                        () -> Exercicio3.gerarNomeStarWars(pessoa)
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O sobrenome deve possuir pelo menos 3 caracteres.");
    }

    @Test
    void deveLancarExceptionQuandoSobrenomeMaeSolteiraForNull() {

        // Arrange
        Pessoa pessoa = new Pessoa(
                "Loester",
                "Gentil",
                null,
                "Floripa"
        );

        // Act & Assert
        Assertions.assertThatThrownBy(
                        () -> Exercicio3.gerarNomeStarWars(pessoa)
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O parâmetro 'sobrenomeMaeSolteira' não pode ser null ou vazio.");
    }

    @Test
    void deveLancarExceptionQuandoSobrenomeMaeSolteiraForVazio() {

        // Arrange
        Pessoa pessoa = new Pessoa(
                "Loester",
                "Gentil",
                "",
                "Floripa"
        );

        // Act & Assert
        Assertions.assertThatThrownBy(
                        () -> Exercicio3.gerarNomeStarWars(pessoa)
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O parâmetro 'sobrenomeMaeSolteira' não pode ser null ou vazio.");
    }

    @Test
    void deveLancarExceptionQuandoSobrenomeMaeSolteiraForCurto() {

        // Arrange
        Pessoa pessoa = new Pessoa(
                "Loester",
                "Gentil",
                "S",
                "Floripa"
        );

        // Act & Assert
        Assertions.assertThatThrownBy(
                        () -> Exercicio3.gerarNomeStarWars(pessoa)
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O sobrenome materno deve possuir pelo menos 2 caracteres.");
    }

    @Test
    void deveLancarExceptionQuandoCidadeNascimentoForNull() {

        // Arrange
        Pessoa pessoa = new Pessoa(
                "Loester",
                "Gentil",
                "Suave",
                null
        );

        // Act & Assert
        Assertions.assertThatThrownBy(
                        () -> Exercicio3.gerarNomeStarWars(pessoa)
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O parâmetro 'cidadeNascimento' não pode ser null ou vazio.");
    }

    @Test
    void deveLancarExceptionQuandoCidadeNascimentoForVazia() {

        // Arrange
        Pessoa pessoa = new Pessoa(
                "Loester",
                "Gentil",
                "Suave",
                ""
        );

        // Act & Assert
        Assertions.assertThatThrownBy(
                        () -> Exercicio3.gerarNomeStarWars(pessoa)
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O parâmetro 'cidadeNascimento' não pode ser null ou vazio.");
    }

    @Test
    void deveLancarExceptionQuandoCidadeNascimentoForCurta() {

        // Arrange
        Pessoa pessoa = new Pessoa(
                "Loester",
                "Gentil",
                "Suave",
                "Fl"
        );

        // Act & Assert
        Assertions.assertThatThrownBy(
                        () -> Exercicio3.gerarNomeStarWars(pessoa)
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("A cidade de nascimento deve possuir pelo menos 3 caracteres.");
    }
}
