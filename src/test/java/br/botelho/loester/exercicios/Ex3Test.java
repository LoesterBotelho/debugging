package br.botelho.loester.exercicios;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.botelho.loester.exception.DiaSemanaInvalidoException;
import br.botelho.loester.exception.HoraInvalidaException;

@DisplayName("Testes do exercício de análise de temperaturas")
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
    @DisplayName("Deve executar corretamente com dia da semana e hora válidos")
    void deveExecutarComDiaEHoraValidos() {
        Scanner scanner = new Scanner("segunda 12");

        assertDoesNotThrow(() -> ex3.executar(scanner));

        String resultado = output.toString();

        assertTrue(resultado.contains("Média do dia:"));
        assertTrue(resultado.contains("Média da temperatura às 12 horas:"));
        assertTrue(resultado.contains("Maior amplitude térmica:"));
    }

    @Test
    @DisplayName("Deve lançar exceção quando o dia da semana for inválido")
    void deveLancarExcecaoQuandoDiaForInvalido() {
        Scanner scanner = new Scanner("invalido");

        assertThrows(
                DiaSemanaInvalidoException.class,
                () -> ex3.executar(scanner)
        );
    }

    @Test
    @DisplayName("Deve lançar exceção quando a hora for negativa")
    void deveLancarExcecaoQuandoHoraForNegativa() {
        Scanner scanner = new Scanner("segunda -1");

        assertThrows(
                HoraInvalidaException.class,
                () -> ex3.executar(scanner)
        );
    }

    @Test
    @DisplayName("Deve lançar exceção quando a hora for maior ou igual a 24")
    void deveLancarExcecaoQuandoHoraForMaiorOuIgualA24() {
        Scanner scanner = new Scanner("segunda 24");

        assertThrows(
                HoraInvalidaException.class,
                () -> ex3.executar(scanner)
        );
    }

    @Test
    @DisplayName("Deve lançar exceção quando a hora não for numérica")
    void deveLancarExcecaoQuandoHoraNaoForNumero() {
        Scanner scanner = new Scanner("segunda abc");

        assertThrows(
                HoraInvalidaException.class,
                () -> ex3.executar(scanner)
        );
    }
}