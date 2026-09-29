package br.botelho.loester.exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.botelho.loester.exception.DiaSemanaInvalidoException;
import br.botelho.loester.exception.HoraInvalidaException;

public class Ex3 {

    private static final double[][] TEMPERATURAS = {
            {22.1, 23.5, 24.0, 23.8, 22.6, 21.9, 21.7, 22.2, 23.0, 24.1, 24.5, 24.0, 24.3, 24.4, 24.0, 24.5, 24.1, 24.4, 24.8, 24.5, 24.3, 24.7, 24.9, 23.8},
            {21.8, 22.7, 23.2, 23.9, 23.7, 22.8, 22.5, 22.1, 22.9, 24.0, 24.6, 25.1, 26.2, 27.5, 28.1, 28.6, 29.2, 29.5, 28.9, 27.6, 26.4, 25.8, 25.1, 24.0},
            {20.7, 21.0, 21.5, 22.1, 22.5, 22.7, 22.9, 23.1, 23.5, 23.9, 24.2, 24.6, 25.0, 25.3, 25.6, 25.9, 26.2, 26.5, 26.8, 27.1, 27.4, 27.7, 27.9, 27.8},
            {20.2, 20.5, 21.0, 21.4, 21.8, 22.2, 22.5, 22.8, 23.1, 23.3, 23.6, 23.9, 24.2, 24.5, 24.8, 25.1, 25.4, 25.7, 26.0, 26.3, 26.6, 26.9, 27.1, 27.2},
            {19.8, 20.0, 20.3, 20.7, 21.1, 21.4, 21.8, 22.1, 22.4, 22.7, 23.0, 23.3, 23.6, 23.9, 24.2, 24.5, 24.8, 25.1, 25.4, 25.7, 26.0, 26.2, 26.3, 26.5},
            {19.5, 19.8, 20.1, 23.5, 23.9, 24.3, 24.7, 25.1, 24.7, 26.8, 27.1, 28.4, 28.7, 29.0, 28.3, 28.6, 28.9, 29.2, 28.5, 28.8, 28.1, 27.3, 27.5, 26.7},
            {19.2, 19.5, 19.9, 20.3, 20.7, 21.1, 21.5, 21.9, 22.3, 22.7, 23.1, 23.4, 23.7, 24.0, 24.3, 24.6, 24.9, 25.2, 25.5, 25.8, 26.1, 26.3, 26.5, 26.7}
    };

    private static final String[] DIAS_SEMANA = {
            "domingo",
            "segunda",
            "terça",
            "quarta",
            "quinta",
            "sexta",
            "sábado"
    };

    public void executar(Scanner scanner) {

        int indiceDia = solicitarDia(scanner);

        calcularMediaDia(indiceDia);

        int hora = solicitarHora(scanner);

        calcularMediaHora(hora);

        calcularMaiorAmplitude();
    }

    private int solicitarDia(Scanner scanner) {

        System.out.println("Digite: domingo, segunda, terça, quarta, quinta, sexta ou sábado.");

        System.out.print("Digite um dia da semana para calcular a média diária: ");

        String diaEscolhido = scanner.next().toLowerCase();

        for (int i = 0; i < DIAS_SEMANA.length; i++) {

            if (diaEscolhido.equals(DIAS_SEMANA[i])) {
                return i;
            }
        }

        throw new DiaSemanaInvalidoException(
                "Dia da semana inválido: " + diaEscolhido
        );
    }

    private void calcularMediaDia(int indiceDia) {

        double soma = 0.0;

        for (double temperatura : TEMPERATURAS[indiceDia]) {
            soma += temperatura;
        }

        double mediaDia = soma / TEMPERATURAS[indiceDia].length;

        System.out.println("Média do dia: " + mediaDia);
    }

    private int solicitarHora(Scanner scanner) {

        System.out.println("Digite uma hora de 0 até 23.");

        System.out.print("Digite a hora para calcular a média da temperatura através dos dias: ");

        try {

            int hora = scanner.nextInt();

            if (hora < 0 || hora >= 24) {

                throw new HoraInvalidaException(
                        "Hora inválida: " + hora + ". Digite uma hora de 0 até 23."
                );
            }

            return hora;

        } catch (InputMismatchException e) {

            scanner.next();

            throw new HoraInvalidaException(
                    "Entrada inválida. Digite um número inteiro."
            );
        }
    }

    private void calcularMediaHora(int hora) {

        double soma = 0.0;

        for (double[] temperatura : TEMPERATURAS) {
            soma += temperatura[hora];
        }

        double mediaHora = soma / TEMPERATURAS.length;

        System.out.println("Média da temperatura às " + hora + " horas: " + mediaHora);
    }

    private void calcularMaiorAmplitude() {

        double maiorAmplitude = 0.0;
        int indiceMaiorAmplitude = 0;

        for (int i = 0; i < TEMPERATURAS.length; i++) {

            double menor = TEMPERATURAS[i][0];
            double maior = TEMPERATURAS[i][0];

            for (double temperatura : TEMPERATURAS[i]) {

                if (temperatura < menor) {
                    menor = temperatura;
                }

                if (temperatura > maior) {
                    maior = temperatura;
                }
            }

            double amplitude = maior - menor;

            if (amplitude > maiorAmplitude) {
                maiorAmplitude = amplitude;
                indiceMaiorAmplitude = i;
            }
        }

        System.out.println(
                "Maior amplitude térmica: "
                        + DIAS_SEMANA[indiceMaiorAmplitude]
                        + " (" + maiorAmplitude + " °C)"
        );
    }
}