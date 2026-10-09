package br.botelho.loester.outros.numerosromanos;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Boa prática: classe e métodos package-private são suficientes para os testes.
@DisplayName("Testes de conversão de números inteiros para números romanos")
class ConversorRomanoTest {

    @Test
    @DisplayName("Deve converter o número 1 para I")
    void deveConverterNumero1ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(1);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("I");
    }

    @Test
    @DisplayName("Deve converter o número 2 para II")
    void deveConverterNumero2ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(2);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("II");
    }

    @Test
    @DisplayName("Deve converter o número 3 para III")
    void deveConverterNumero3ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(3);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("III");
    }

    @Test
    @DisplayName("Deve converter o número 4 para IV")
    void deveConverterNumero4ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(4);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("IV");
    }

    @Test
    @DisplayName("Deve converter o número 5 para V")
    void deveConverterNumero5ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(5);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("V");
    }

    @Test
    @DisplayName("Deve converter o número 6 para VI")
    void deveConverterNumero6ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(6);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("VI");
    }

    @Test
    @DisplayName("Deve converter o número 7 para VII")
    void deveConverterNumero7ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(7);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("VII");
    }

    @Test
    @DisplayName("Deve converter o número 8 para VIII")
    void deveConverterNumero8ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(8);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("VIII");
    }

    @Test
    @DisplayName("Deve converter o número 9 para IX")
    void deveConverterNumero9ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(9);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("IX");
    }

    @Test
    @DisplayName("Deve converter o número 10 para X")
    void deveConverterNumero10ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(10);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("X");
    }

    @Test
    @DisplayName("Deve converter o número 14 para XIV")
    void deveConverterNumero14ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(14);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("XIV");
    }

    @Test
    @DisplayName("Deve converter o número 19 para XIX")
    void deveConverterNumero19ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(19);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("XIX");
    }

    @Test
    @DisplayName("Deve converter o número 20 para XX")
    void deveConverterNumero20ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(20);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("XX");
    }

    @Test
    @DisplayName("Deve converter o número 40 para XL")
    void deveConverterNumero40ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(40);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("XL");
    }

    @Test
    @DisplayName("Deve converter o número 49 para XLIX")
    void deveConverterNumero49ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(49);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("XLIX");
    }

    @Test
    @DisplayName("Deve converter o número 50 para L")
    void deveConverterNumero50ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(50);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("L");
    }

    @Test
    @DisplayName("Deve converter o número 58 para LVIII")
    void deveConverterNumero58ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(58);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("LVIII");
    }

    @Test
    @DisplayName("Deve converter o número 90 para XC")
    void deveConverterNumero90ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(90);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("XC");
    }

    @Test
    @DisplayName("Deve converter o número 99 para XCIX")
    void deveConverterNumero99ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(99);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("XCIX");
    }

    @Test
    @DisplayName("Deve converter o número 100 para C")
    void deveConverterNumero100ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(100);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("C");
    }

    @Test
    @DisplayName("Deve converter o número 400 para CD")
    void deveConverterNumero400ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(400);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("CD");
    }

    @Test
    @DisplayName("Deve converter o número 500 para D")
    void deveConverterNumero500ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(500);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("D");
    }

    @Test
    @DisplayName("Deve converter o número 900 para CM")
    void deveConverterNumero900ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(900);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("CM");
    }

    @Test
    @DisplayName("Deve converter o número 1000 para M")
    void deveConverterNumero1000ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(1000);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("M");
    }

    @Test
    @DisplayName("Deve converter o número 1984 para MCMLXXXIV")
    void deveConverterNumero1984ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(1984);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("MCMLXXXIV");
    }

    @Test
    @DisplayName("Deve converter o número 2026 para MMXXVI")
    void deveConverterNumero2026ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(2026);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("MMXXVI");
    }

    @Test
    @DisplayName("Deve converter o número 3999 para MMMCMXCIX")
    void deveConverterNumero3999ParaRomano() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(3999);

        // Assert
        Assertions.assertThat(resultado).isEqualTo("MMMCMXCIX");
    }

    @Test
    @DisplayName("Deve retornar uma string vazia quando o número for zero")
    void deveRetornarStringVaziaQuandoNumeroForZero() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(0);

        // Assert
        Assertions.assertThat(resultado).isEmpty();
    }

    @Test
    @DisplayName("Deve retornar uma string vazia quando o número for negativo")
    void deveRetornarStringVaziaQuandoNumeroForNegativo() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(-1);

        // Assert
        Assertions.assertThat(resultado).isEmpty();
    }

    @Test
    @DisplayName("Deve retornar uma string vazia quando o número for maior que 3999")
    void deveRetornarStringVaziaQuandoNumeroForMaiorQue3999() {
        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(4000);

        // Assert
        Assertions.assertThat(resultado).isEmpty();
    }
}