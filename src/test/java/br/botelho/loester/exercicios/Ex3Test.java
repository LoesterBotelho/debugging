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

import br.botelho.loester.exception.DiaSemanaInvalidoException;
import br.botelho.loester.exception.HoraInvalidaException;

class Ex3Test {

    private final Ex3 ex3 = new Ex3();

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
    void deveExecutarComDiaEHoraValidos() {
        Scanner scanner = new Scanner("segunda 12");

        assertDoesNotThrow(() -> ex3.executar(scanner));

        String resultado = output.toString();

        assertTrue(resultado.contains("Média do dia:"));
        assertTrue(resultado.contains("Média da temperatura às 12 horas:"));
        assertTrue(resultado.contains("Maior amplitude térmica:"));
    }

    @Test
    void deveLancarExcecaoQuandoDiaForInvalido() {
        Scanner scanner = new Scanner("invalido");

        assertThrows(
                DiaSemanaInvalidoException.class,
                () -> ex3.executar(scanner)
        );
    }

    @Test
    void deveLancarExcecaoQuandoHoraForNegativa() {
        Scanner scanner = new Scanner("segunda -1");

        assertThrows(
                HoraInvalidaException.class,
                () -> ex3.executar(scanner)
        );
    }

    @Test
    void deveLancarExcecaoQuandoHoraForMaiorOuIgualA24() {
        Scanner scanner = new Scanner("segunda 24");

        assertThrows(
                HoraInvalidaException.class,
                () -> ex3.executar(scanner)
        );
    }

    @Test
    void deveLancarExcecaoQuandoHoraNaoForNumero() {
        Scanner scanner = new Scanner("segunda abc");

        assertThrows(
                HoraInvalidaException.class,
                () -> ex3.executar(scanner)
        );
    }
}