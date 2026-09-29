package br.botelho.loester.exercicios;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.botelho.loester.exception.EntradaNumeroInvalidaException;

class Ex2Test {

    private final Ex2 ex2 = new Ex2();

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    private PrintStream outputOriginal;

    @BeforeEach
    void configurarSaida() {
        outputOriginal = System.out;
        System.setOut(new PrintStream(output));
    }

    @AfterEach
    void restaurarSaida() {
        System.setOut(outputOriginal);
    }

    @Test
    void deveCalcularMaiorMenorSomaEMedia() {
        Scanner scanner = new Scanner("1 2 3 4 6");

        assertDoesNotThrow(() -> ex2.executar(scanner));

        String resultado = output.toString();

        assertTrue(resultado.contains("Maior número: 6"));
        assertTrue(resultado.contains("Menor número: 1"));
        assertTrue(resultado.contains("Soma dos números: 16"));
        assertTrue(resultado.contains("Média dos números: 3.2"));
    }

    @Test
    void deveLancarExcecaoQuandoEntradaNaoForNumero() {
        Scanner scanner = new Scanner("1 2 abc 4 5");

        assertThrows(
                EntradaNumeroInvalidaException.class,
                () -> ex2.executar(scanner)
        );
    }
}