package br.botelho.loester.exercicios05102026.exercicio3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

// Should / When / Then
// Deve / Quando / Então

class PessoaTest {

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
    String nomeStarWars = pessoa.gerarNomeStarWars();

    // Assert
    Assertions.assertThat(nomeStarWars)
            .isEqualTo("GenLo SuFlo");
}

@Test
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
