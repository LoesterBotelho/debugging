package br.botelho.loester.exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {

    public void executar(Scanner scanner) {

        Integer[] numeros = new Integer[5];

        System.out.println("Digite 5 números:");

        for (int i = 0; i < numeros.length; i++) {

            while (true) {

                try {

                    System.out.print("Número " + (i + 1) + ": ");

                    numeros[i] = scanner.nextInt();

                    break;

                } catch (InputMismatchException e) {

                    System.out.println("Entrada inválida. Informe um número inteiro.");

                    scanner.next();
                }
            }
        }

        int maior = numeros[0];
        int menor = numeros[0];
        int soma = 0;

        for (Integer numero : numeros) {

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            soma += numero;
        }

        double media = (double) soma / numeros.length;

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);
    }
}
