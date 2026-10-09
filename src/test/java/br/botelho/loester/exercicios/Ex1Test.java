package br.botelho.loester.exercicios;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Locale;
import java.util.Scanner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.botelho.loester.exception.AlturaInvalidaException;
import br.botelho.loester.exception.EntradaAlturaInvalidaException;
import br.botelho.loester.exception.NenhumaAlturaInformadaException;

@DisplayName("Testes do exercício de cálculo de média das alturas")
class Ex1Test {

    private final Ex1 ex1 = new Ex1();

    @Test
    @DisplayName("Deve calcular a média quando alturas válidas forem informadas")
    void deveCalcularMediaDasAlturas() {

        Scanner scanner = new Scanner(
                "1.70 1.80 1.90 0"
        ).useLocale(Locale.US);

        assertDoesNotThrow(() -> ex1.executar(scanner));
    }

    @Test
    @DisplayName("Deve lançar exceção quando a altura for negativa")
    void deveLancarExcecaoQuandoAlturaForNegativa() {

        Scanner scanner = new Scanner(
                "-1.70"
        ).useLocale(Locale.US);

        assertThrows(
                AlturaInvalidaException.class,
                () -> ex1.executar(scanner)
        );
    }

    @Test
    @DisplayName("Deve lançar exceção quando a entrada não for numérica")
    void deveLancarExcecaoQuandoEntradaNaoForNumero() {

        Scanner scanner = new Scanner(
                "abc"
        ).useLocale(Locale.US);

        assertThrows(
                EntradaAlturaInvalidaException.class,
                () -> ex1.executar(scanner)
        );
    }

    @Test
    @DisplayName("Deve lançar exceção quando nenhuma altura for informada")
    void deveLancarExcecaoQuandoNenhumaAlturaForInformada() {

        Scanner scanner = new Scanner(
                "0"
        ).useLocale(Locale.US);

        assertThrows(
                NenhumaAlturaInformadaException.class,
                () -> ex1.executar(scanner)
        );
    }
}