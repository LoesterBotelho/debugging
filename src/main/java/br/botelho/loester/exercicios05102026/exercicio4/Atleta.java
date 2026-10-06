package br.botelho.loester.exercicios05102026.exercicio4;

public record Atleta(
        String nome,
        int idade,
        double altura,
        double peso
) {

    public String classificarCategoria() {

        if (idade < 5) {
            throw new IllegalArgumentException(
                    "A idade deve ser maior ou igual a 5 anos."
            );
        }

        if (idade <= 7) {
            return "Pré-mirim";
        }

        if (idade <= 10) {
            return "Mirim";
        }

        if (idade <= 13) {
            return "Infantil";
        }

        if (idade <= 17) {
            return "Infanto-juvenil";
        }

        if (idade <= 20) {
            return "Juvenil";
        }

        return "Adulto";
    }

    public double calcularImc() {

        if (altura <= 0) {
            throw new IllegalArgumentException(
                    "A altura deve ser maior que zero."
            );
        }

        if (peso < 0) {
            throw new IllegalArgumentException(
                    "O peso não pode ser negativo."
            );
        }

        return peso / (altura * altura);
    }

    public String classificarImc() {

        double imc = calcularImc();

        if (imc < 18.5) {
            return "Magreza";
        }

        if (imc <= 24.9) {
            return "Saudável";
        }

        if (imc <= 29.9) {
            return "Sobrepeso";
        }

        if (imc <= 34.9) {
            return "Obesidade Grau I";
        }

        if (imc <= 39.9) {
            return "Obesidade Grau II (severa)";
        }

        return "Obesidade Grau III (mórbida)";
    }
}