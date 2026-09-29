package br.botelho.loester.exercicios;
import java.util.Scanner;

/**
 * Exercício 2)
 * <br>
 * Crie uma array de 5 elementos e descubra:
 * <br>
 * a) Qual o maior elemento
 * <br>
 * b) Qual o menor elemento
 * <br>
 * c) A média dos elementos
 */
public class Ex2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer[] numeros = new Integer[5];

		System.out.println("Digite 5 números:");
		
		for (Integer i = 0; i < numeros.length; i++) {
			
			System.out.print("Número " + (i) + ": ");
			numeros[i] = sc.nextInt();
			
		}

		int maior = 0;
		int menor = 0;
		int soma = 0;

		maior = numeros[0];
		menor = numeros[0];

		for (Integer num : numeros) {
			
			if (num > maior) {
				maior = num;
			}
			
			if (num < menor) {
				menor = num;
			}
			
			soma += num;
		}

		sc.close();
		
		double media = soma / numeros.length;

		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);
		System.out.println("Media dos números: " + media);

	}
}
