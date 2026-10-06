package br.botelho.loester.exercicios;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Locale;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import br.botelho.loester.exception.AlturaInvalidaException;
import br.botelho.loester.exception.EntradaAlturaInvalidaException;
import br.botelho.loester.exception.NenhumaAlturaInformadaException;

class Ex1Test {

    private final Ex1 ex1 = new Ex1();

    @Test
    void deveCalcularMediaDasAlturas() {

        Scanner scanner = new Scanner(
                "1.70 1.80 1.90 0"
        ).useLocale(Locale.US);

        assertDoesNotThrow(() -> ex1.executar(scanner));
    }

    @Test
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