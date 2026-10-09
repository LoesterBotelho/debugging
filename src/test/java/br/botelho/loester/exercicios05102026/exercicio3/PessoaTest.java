package br.botelho.loester.exercicios05102026.exercicio3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Should / When / Then
// Deve / Quando / Então

@DisplayName("Testes para geração e validação do nome Star Wars")
class PessoaTest {

    @Test
    @DisplayName("Deve retornar o nome Star Wars quando a pessoa for válida")
    void deveRetornarNomeStarWarsQuandoPessoaForValida() {

        // Arrange
        Pessoa pessoa = new Pessoa(
                "Loester",
                "Gentil",
                "Suave",
                "Floripa"
        );

        // Act
        String nomeStarWars = pessoa.gerarNomeStarWars();

        // Assert
        Assertions.assertThat(nomeStarWars)
                .isEqualTo("GenLo SuFlo");
    }

    @Test
    @DisplayName("Deve lançar exceção quando o nome for nulo")
    void deveLancarExceptionQuandoNomeForNull() {

        // Act & Assert
        Assertions.assertThatThrownBy(
                        () -> new Pessoa(
                                null,
                                "Gentil",
                                "Suave",
                                "Floripa"
                        )
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O parâmetro 'nome' não pode ser null ou vazio.");
    }

    @Test
    @DisplayName("Deve lançar exceção quando o nome estiver vazio")
    void deveLancarExceptionQuandoNomeForVazio() {

        // Act & Assert
        Assertions.assertThatThrownBy(
                        () -> new Pessoa(
                                "",
                                "Gentil",
                                "Suave",
                                "Floripa"
                        )
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O parâmetro 'nome' não pode ser null ou vazio.");
    }

    @Test
    @DisplayName("Deve lançar exceção quando o nome tiver menos de 2 caracteres")
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
                        pessoa::gerarNomeStarWars
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O nome deve possuir pelo menos 2 caracteres.");
    }

    @Test
    @DisplayName("Deve lançar exceção quando o sobrenome for nulo")
    void deveLancarExceptionQuandoSobrenomeForNull() {

        // Act & Assert
        Assertions.assertThatThrownBy(
                        () -> new Pessoa(
                                "Loester",
                                null,
                                "Suave",
                                "Floripa"
                        )
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O parâmetro 'sobrenome' não pode ser null ou vazio.");
    }

    @Test
    @DisplayName("Deve lançar exceção quando o sobrenome estiver vazio")
    void deveLancarExceptionQuandoSobrenomeForVazio() {

        // Act & Assert
        Assertions.assertThatThrownBy(
                        () -> new Pessoa(
                                "Loester",
                                "",
                                "Suave",
                                "Floripa"
                        )
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O parâmetro 'sobrenome' não pode ser null ou vazio.");
    }

    @Test
    @DisplayName("Deve lançar exceção quando o sobrenome tiver menos de 3 caracteres")
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
                        pessoa::gerarNomeStarWars
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O sobrenome deve possuir pelo menos 3 caracteres.");
    }

    @Test
    @DisplayName("Deve lançar exceção quando o sobrenome materno for nulo")
    void deveLancarExceptionQuandoSobrenomeMaeSolteiraForNull() {

        // Act & Assert
        Assertions.assertThatThrownBy(
                        () -> new Pessoa(
                                "Loester",
                                "Gentil",
                                null,
                                "Floripa"
                        )
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O parâmetro 'sobrenomeMaeSolteira' não pode ser null ou vazio.");
    }

    @Test
    @DisplayName("Deve lançar exceção quando o sobrenome materno estiver vazio")
    void deveLancarExceptionQuandoSobrenomeMaeSolteiraForVazio() {

        // Act & Assert
        Assertions.assertThatThrownBy(
                        () -> new Pessoa(
                                "Loester",
                                "Gentil",
                                "",
                                "Floripa"
                        )
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O parâmetro 'sobrenomeMaeSolteira' não pode ser null ou vazio.");
    }

    @Test
    @DisplayName("Deve lançar exceção quando o sobrenome materno tiver menos de 2 caracteres")
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
                        pessoa::gerarNomeStarWars
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O sobrenome materno deve possuir pelo menos 2 caracteres.");
    }

    @Test
    @DisplayName("Deve lançar exceção quando a cidade de nascimento for nula")
    void deveLancarExceptionQuandoCidadeNascimentoForNull() {

        // Act & Assert
        Assertions.assertThatThrownBy(
                        () -> new Pessoa(
                                "Loester",
                                "Gentil",
                                "Suave",
                                null
                        )
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O parâmetro 'cidadeNascimento' não pode ser null ou vazio.");
    }

    @Test
    @DisplayName("Deve lançar exceção quando a cidade de nascimento estiver vazia")
    void deveLancarExceptionQuandoCidadeNascimentoForVazia() {

        // Act & Assert
        Assertions.assertThatThrownBy(
                        () -> new Pessoa(
                                "Loester",
                                "Gentil",
                                "Suave",
                                ""
                        )
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("O parâmetro 'cidadeNascimento' não pode ser null ou vazio.");
    }

    @Test
    @DisplayName("Deve lançar exceção quando a cidade tiver menos de 3 caracteres")
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
                        pessoa::gerarNomeStarWars
                )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("A cidade de nascimento deve possuir pelo menos 3 caracteres.");
    }
}