package br.botelho.loester.exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.botelho.loester.exception.EntradaNumeroInvalidaException;
import br.botelho.loester.exception.QuantidadeNumerosInvalidaException;

public class Ex2 {

    private static final int QUANTIDADE_NUMEROS = 5;

    public void executar(Scanner scanner) {

        Integer[] numeros = lerNumeros(scanner);

        int maior = encontrarMaior(numeros);

        int menor = encontrarMenor(numeros);

        int soma = calcularSoma(numeros);

        double media = calcularMedia(soma, numeros.length);

        System.out.println("Maior número: " + maior);

        System.out.println("Menor número: " + menor);

        System.out.println("Soma dos números: " + soma);

        System.out.println("Média dos números: " + media);
    }

    private Integer[] lerNumeros(Scanner scanner) {

        // O bloco 'if' redundante foi removido daqui!

        Integer[] numeros = new Integer[QUANTIDADE_NUMEROS];

        System.out.println("Digite " + QUANTIDADE_NUMEROS + " números:");

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Número " + (i + 1) + ": ");

            try {

                numeros[i] = scanner.nextInt();

            } catch (InputMismatchException e) {

                scanner.next();

                throw new EntradaNumeroInvalidaException(
                        "Entrada inválida. Informe um número inteiro."
                );
            }
        }

        return numeros;
    }

    private int encontrarMaior(Integer[] numeros) {

        validarNumeros(numeros);

        int maior = numeros[0];

        for (Integer numero : numeros) {

            if (numero > maior) {
                maior = numero;
            }
        }

        return maior;
    }

    private int encontrarMenor(Integer[] numeros) {

        validarNumeros(numeros);

        int menor = numeros[0];

        for (Integer numero : numeros) {

            if (numero < menor) {
                menor = numero;
            }
        }

        return menor;
    }

    private int calcularSoma(Integer[] numeros) {

        validarNumeros(numeros);

        int soma = 0;

        for (Integer numero : numeros) {
            soma += numero;
        }

        return soma;
    }

    private double calcularMedia(int soma, int quantidade) {

        if (quantidade <= 0) {

            throw new QuantidadeNumerosInvalidaException(
                    "A quantidade de números deve ser maior que zero."
            );
        }

        return (double) soma / quantidade;
    }

    private void validarNumeros(Integer[] numeros) {

        if (numeros == null || numeros.length == 0) {

            throw new QuantidadeNumerosInvalidaException(
                    "É necessário informar pelo menos um número."
            );
        }
    }
}