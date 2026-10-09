package br.botelho.loester.exercicios05102026.exercicio4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Should / When / Then
// Deve / Quando / Então

@DisplayName("Testes de classificação de categoria e IMC do atleta")
class AtletaTest {

    @Test
    @DisplayName("Deve classificar como pré-mirim quando a idade for 5 anos")
    void deveClassificarComoPreMirimQuandoIdadeForCincoAnos() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("João", 5, 1.20, 25.0);

        // Act | Agir
        String categoria = atleta.classificarCategoria();

        // Assert | AssertJ
        Assertions.assertThat(categoria)
                .isEqualTo("Pré-mirim");
    }

    @Test
    @DisplayName("Deve classificar como pré-mirim quando a idade for 7 anos")
    void deveClassificarComoPreMirimQuandoIdadeForSeteAnos() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("João", 7, 1.20, 25.0);

        // Act | Agir
        String categoria = atleta.classificarCategoria();

        // Assert | AssertJ
        Assertions.assertThat(categoria)
                .isEqualTo("Pré-mirim");
    }

    @Test
    @DisplayName("Deve classificar como mirim quando a idade for 8 anos")
    void deveClassificarComoMirimQuandoIdadeForOitoAnos() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("Maria", 8, 1.30, 30.0);

        // Act | Agir
        String categoria = atleta.classificarCategoria();

        // Assert | AssertJ
        Assertions.assertThat(categoria)
                .isEqualTo("Mirim");
    }

    @Test
    @DisplayName("Deve classificar como mirim quando a idade for 10 anos")
    void deveClassificarComoMirimQuandoIdadeForDezAnos() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("Maria", 10, 1.30, 30.0);

        // Act | Agir
        String categoria = atleta.classificarCategoria();

        // Assert | AssertJ
        Assertions.assertThat(categoria)
                .isEqualTo("Mirim");
    }

    @Test
    @DisplayName("Deve classificar como infantil quando a idade for 11 anos")
    void deveClassificarComoInfantilQuandoIdadeForOnzeAnos() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("Pedro", 11, 1.45, 40.0);

        // Act | Agir
        String categoria = atleta.classificarCategoria();

        // Assert | AssertJ
        Assertions.assertThat(categoria)
                .isEqualTo("Infantil");
    }

    @Test
    @DisplayName("Deve classificar como infantil quando a idade for 13 anos")
    void deveClassificarComoInfantilQuandoIdadeForTrezeAnos() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("Pedro", 13, 1.55, 45.0);

        // Act | Agir
        String categoria = atleta.classificarCategoria();

        // Assert | AssertJ
        Assertions.assertThat(categoria)
                .isEqualTo("Infantil");
    }

    @Test
    @DisplayName("Deve classificar como infanto-juvenil quando a idade for 14 anos")
    void deveClassificarComoInfantoJuvenilQuandoIdadeForQuatorzeAnos() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("Lucas", 14, 1.60, 50.0);

        // Act | Agir
        String categoria = atleta.classificarCategoria();

        // Assert | AssertJ
        Assertions.assertThat(categoria)
                .isEqualTo("Infanto-juvenil");
    }

    @Test
    @DisplayName("Deve classificar como infanto-juvenil quando a idade for 17 anos")
    void deveClassificarComoInfantoJuvenilQuandoIdadeForDezesseteAnos() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("Lucas", 17, 1.70, 60.0);

        // Act | Agir
        String categoria = atleta.classificarCategoria();

        // Assert | AssertJ
        Assertions.assertThat(categoria)
                .isEqualTo("Infanto-juvenil");
    }

    @Test
    @DisplayName("Deve classificar como juvenil quando a idade for 18 anos")
    void deveClassificarComoJuvenilQuandoIdadeForDezoitoAnos() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("Ana", 18, 1.65, 55.0);

        // Act | Agir
        String categoria = atleta.classificarCategoria();

        // Assert | AssertJ
        Assertions.assertThat(categoria)
                .isEqualTo("Juvenil");
    }

    @Test
    @DisplayName("Deve classificar como juvenil quando a idade for 20 anos")
    void deveClassificarComoJuvenilQuandoIdadeForVinteAnos() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("Ana", 20, 1.65, 55.0);

        // Act | Agir
        String categoria = atleta.classificarCategoria();

        // Assert | AssertJ
        Assertions.assertThat(categoria)
                .isEqualTo("Juvenil");
    }

    @Test
    @DisplayName("Deve classificar como adulto quando a idade for 21 anos")
    void deveClassificarComoAdultoQuandoIdadeForVinteUmAnos() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("Carlos", 21, 1.80, 80.0);

        // Act | Agir
        String categoria = atleta.classificarCategoria();

        // Assert | AssertJ
        Assertions.assertThat(categoria)
                .isEqualTo("Adulto");
    }

    @Test
    @DisplayName("Deve lançar exceção quando a idade for menor que 5 anos")
    void deveLancarExceptionQuandoIdadeForMenorQueCincoAnos() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("João", 4, 1.20, 25.0);

        // Act | Agir
        Throwable exception = Assertions.catchThrowable(
                atleta::classificarCategoria
        );

        // Assert | AssertJ
        Assertions.assertThat(exception)
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Deve calcular o IMC corretamente")
    void deveCalcularImcCorretamente() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("Carlos", 25, 2.0, 80.0);

        // Act | Agir
        double imc = atleta.calcularImc();

        // Assert | AssertJ
        Assertions.assertThat(imc)
                .isEqualTo(20.0);
    }

    @Test
    @DisplayName("Deve classificar o IMC como magreza")
    void deveClassificarImcComoMagreza() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("Ana", 25, 2.0, 60.0);

        // Act | Agir
        String classificacao = atleta.classificarImc();

        // Assert | AssertJ
        Assertions.assertThat(classificacao)
                .isEqualTo("Magreza");
    }

    @Test
    @DisplayName("Deve classificar o IMC como saudável")
    void deveClassificarImcComoSaudavel() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("Carlos", 25, 2.0, 80.0);

        // Act | Agir
        String classificacao = atleta.classificarImc();

        // Assert | AssertJ
        Assertions.assertThat(classificacao)
                .isEqualTo("Saudável");
    }

    @Test
    @DisplayName("Deve classificar o IMC como sobrepeso")
    void deveClassificarImcComoSobrepeso() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("Pedro", 25, 2.0, 110.0);

        // Act | Agir
        String classificacao = atleta.classificarImc();

        // Assert | AssertJ
        Assertions.assertThat(classificacao)
                .isEqualTo("Sobrepeso");
    }

    @Test
    @DisplayName("Deve classificar o IMC como obesidade grau I")
    void deveClassificarImcComoObesidadeGrauI() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("Paulo", 25, 2.0, 125.0);

        // Act | Agir
        String classificacao = atleta.classificarImc();

        // Assert | AssertJ
        Assertions.assertThat(classificacao)
                .isEqualTo("Obesidade Grau I");
    }

    @Test
    @DisplayName("Deve classificar o IMC como obesidade grau II")
    void deveClassificarImcComoObesidadeGrauII() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("Marcos", 25, 2.0, 150.0);

        // Act | Agir
        String classificacao = atleta.classificarImc();

        // Assert | AssertJ
        Assertions.assertThat(classificacao)
                .isEqualTo("Obesidade Grau II (severa)");
    }

    @Test
    @DisplayName("Deve classificar o IMC como obesidade grau III")
    void deveClassificarImcComoObesidadeGrauIII() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("Roberto", 25, 2.0, 170.0);

        // Act | Agir
        String classificacao = atleta.classificarImc();

        // Assert | AssertJ
        Assertions.assertThat(classificacao)
                .isEqualTo("Obesidade Grau III (mórbida)");
    }

    @Test
    @DisplayName("Deve lançar exceção quando a altura for zero")
    void deveLancarExceptionQuandoAlturaForZero() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("Carlos", 25, 0.0, 80.0);

        // Act | Agir
        Throwable exception = Assertions.catchThrowable(
                atleta::calcularImc
        );

        // Assert | AssertJ
        Assertions.assertThat(exception)
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Deve lançar exceção quando o peso for negativo")
    void deveLancarExceptionQuandoPesoForNegativo() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("Carlos", 25, 1.80, -80.0);

        // Act | Agir
        Throwable exception = Assertions.catchThrowable(
                atleta::calcularImc
        );

        // Assert | AssertJ
        Assertions.assertThat(exception)
                .isInstanceOf(IllegalArgumentException.class);
    }
}