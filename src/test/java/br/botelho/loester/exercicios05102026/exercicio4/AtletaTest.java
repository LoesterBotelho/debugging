package br.botelho.loester.exercicios05102026.exercicio4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

// Should / When / Then
// Deve / Quando / Então

class AtletaTest {

    @Test
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
    void deveLancarExceptionQuandoIdadeForMenorQueCincoAnos() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("João", 4, 1.20, 25.0);

        // Act | Agir
        Throwable exception = Assertions.catchThrowable(atleta::classificarCategoria);

        // Assert | AssertJ
        Assertions.assertThat(exception)
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
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
    void deveLancarExceptionQuandoAlturaForZero() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("Carlos", 25, 0.0, 80.0);

        // Act | Agir
        Throwable exception = Assertions.catchThrowable(atleta::calcularImc);

        // Assert | AssertJ
        Assertions.assertThat(exception)
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void deveLancarExceptionQuandoPesoForNegativo() {

        // Arrange | Preparar
        Atleta atleta = new Atleta("Carlos", 25, 1.80, -80.0);

        // Act | Agir
        Throwable exception = Assertions.catchThrowable(atleta::calcularImc);

        // Assert | AssertJ
        Assertions.assertThat(exception)
                .isInstanceOf(IllegalArgumentException.class);
    }

}

