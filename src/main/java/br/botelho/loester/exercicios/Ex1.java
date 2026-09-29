package br.botelho.loester.exercicios;
import java.util.Scanner;

/**
 * Exercício 1)
 * <br>
 * Descreva um algoritmo que vá lendo a altura de pessoas até o usuário entrar
 * com o número 0
 * <br>
 * Ao final, calcule a média das alturas informadas.
 */
public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double altura = 0.0;
		double somaAltura = 0.0;
		int contador = 0;
				
		while (true) {
						
			System.out.println("Insira a altura");
			altura = sc.nextDouble();
			
			if (altura > 0) {
				contador++;
				somaAltura += altura;
			} else {
				break;
			}
		}

		sc.close();
		
		double media = somaAltura / contador;

		System.out.println("Média de altura: " + media + " metros");
	}

}
