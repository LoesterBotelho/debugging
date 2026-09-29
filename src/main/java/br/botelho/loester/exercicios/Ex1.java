package br.botelho.loester.exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.botelho.loester.exception.AlturaInvalidaException;
import br.botelho.loester.exception.EntradaAlturaInvalidaException;
import br.botelho.loester.exception.NenhumaAlturaInformadaException;

public class Ex1 {

    public void executar(Scanner scanner) {

        double somaAltura = 0.0;

        int contador = 0;

        while (true) {

            System.out.print("Insira a altura: ");

            double altura;

            try {

                altura = scanner.nextDouble();

            } catch (InputMismatchException e) {

                scanner.next();

                throw new EntradaAlturaInvalidaException(
                        "Entrada inválida. Informe uma altura válida."
                );
            }

            if (altura == 0) {
                break;
            }

            validarAltura(altura);

            somaAltura += altura;

            contador++;
        }

        if (contador == 0) {

            throw new NenhumaAlturaInformadaException(
                    "Nenhuma altura foi informada."
            );
        }

        double media = calcularMedia(somaAltura, contador);

        System.out.println("Média de altura: " + media + " metros");
    }

    private void validarAltura(double altura) {

        if (altura < 0) {

            throw new AlturaInvalidaException(
                    "A altura deve ser maior que zero."
            );
        }
    }

    private double calcularMedia(double somaAltura, int contador) {

        return somaAltura / contador;
    }
}
