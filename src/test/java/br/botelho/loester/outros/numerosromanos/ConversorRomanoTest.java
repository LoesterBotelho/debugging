package br.botelho.loester.outros.numerosromanos;

import org.assertj.core.api.Assertions;

import org.junit.jupiter.api.Test;

// default visto somente no mesmo pacote
// boa prática

// não precisa ser public a class e métodos

// uma função, um teste, um valor

// Arrange, Act e Assert (AAA)

// Arrange (Arrumar)
// Act (Agir)
// Assert (Assegurar)

class ConversorRomanoTest {

    @Test
    void deveConverterNumero1ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(1);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("I");
    }

    @Test
    void deveConverterNumero2ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(2);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("II");
    }

    @Test
    void deveConverterNumero3ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(3);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("III");
    }

    @Test
    void deveConverterNumero4ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(4);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("IV");
    }

    @Test
    void deveConverterNumero5ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(5);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("V");
    }

    @Test
    void deveConverterNumero6ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(6);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("VI");
    }

    @Test
    void deveConverterNumero7ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(7);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("VII");
    }

    @Test
    void deveConverterNumero8ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(8);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("VIII");
    }

    @Test
    void deveConverterNumero9ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(9);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("IX");
    }

    @Test
    void deveConverterNumero10ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(10);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("X");
    }

    @Test
    void deveConverterNumero14ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(14);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("XIV");
    }

    @Test
    void deveConverterNumero19ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(19);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("XIX");
    }

    @Test
    void deveConverterNumero20ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(20);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("XX");
    }

    @Test
    void deveConverterNumero40ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(40);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("XL");
    }

    @Test
    void deveConverterNumero49ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(49);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("XLIX");
    }

    @Test
    void deveConverterNumero50ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(50);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("L");
    }

    @Test
    void deveConverterNumero58ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(58);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("LVIII");
    }

    @Test
    void deveConverterNumero90ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(90);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("XC");
    }

    @Test
    void deveConverterNumero99ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(99);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("XCIX");
    }

    @Test
    void deveConverterNumero100ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(100);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("C");
    }

    @Test
    void deveConverterNumero400ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(400);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("CD");
    }

    @Test
    void deveConverterNumero500ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(500);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("D");
    }

    @Test
    void deveConverterNumero900ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(900);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("CM");
    }

    @Test
    void deveConverterNumero1000ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(1000);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("M");
    }

    @Test
    void deveConverterNumero1984ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(1984);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("MCMLXXXIV");
    }

    @Test
    void deveConverterNumero2026ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(2026);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("MMXXVI");
    }

    @Test
    void deveConverterNumero3999ParaRomano() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(3999);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEqualTo("MMMCMXCIX");
    }

    @Test
    void deveRetornarStringVaziaQuandoNumeroForZero() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(0);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEmpty();
    }

    @Test
    void deveRetornarStringVaziaQuandoNumeroForNegativo() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(-1);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEmpty();
    }

    @Test
    void deveRetornarStringVaziaQuandoNumeroForMaiorQue3999() {

        // Arrange
        ConversorRomano conversor = new ConversorRomano();

        // Act
        String resultado = conversor.converter(4000);

        // Assert
        // atenção: usar apenas o org.assertj
        Assertions.assertThat(resultado).isEmpty();
    }
}