package br.botelho.loester.outros.numerosromanos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversorRomanoTest {

    @Test
    void deveConverterNumero1ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(1);

        // Assert
        assertEquals("I", resultado);
    }

    @Test
    void deveConverterNumero2ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(2);

        // Assert
        assertEquals("II", resultado);
    }

    @Test
    void deveConverterNumero3ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(3);

        // Assert
        assertEquals("III", resultado);
    }

    @Test
    void deveConverterNumero4ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(4);

        // Assert
        assertEquals("IV", resultado);
    }

    @Test
    void deveConverterNumero5ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(5);

        // Assert
        assertEquals("V", resultado);
    }
}