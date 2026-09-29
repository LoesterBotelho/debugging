package br.botelho.loester.exercicios;

import java.util.Scanner;

public class Ex1 {

    public void executar(Scanner scanner) {

        double somaAltura = 0.0;
        int contador = 0;

        while (true) {

            System.out.print("Insira a altura: ");

            try {

                double altura = scanner.nextDouble();

                if (altura == 0) {
                    break;
                }

                if (altura < 0) {
                    System.out.println("A altura deve ser maior que zero.");
                    continue;
                }

                somaAltura += altura;
                contador++;

            } catch (java.util.InputMismatchException e) {

                System.out.println("Entrada inválida. Informe uma altura válida.");
                scanner.next();
            }
        }

        if (contador == 0) {
            System.out.println("Nenhuma altura foi informada.");
            return;
        }

        double media = somaAltura / contador;

        System.out.println("Média de altura: " + media + " metros");
    }
}