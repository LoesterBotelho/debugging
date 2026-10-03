package br.botelho.loester.outros.numerosromanos;

public class ConversorRomano {

    public String converter(int numero) {

        if (numero == 1) {
            return "I";
        }

        if (numero == 2) {
            return "II";
        }

        if (numero == 3) {
            return "III";
        }

        if (numero == 4) {
            return "IV";
        }

        if (numero == 5) {
            return "V";
        }

        return "";
    }
}