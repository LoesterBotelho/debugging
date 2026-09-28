package testes.exercicios;
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

		Scanner input = new Scanner(System.in);

		double somaAltura = 0;
		int contador = 0;

		double altura;
		while (true) {
			contador++;
			System.out.println("Insira a altura");
			altura = input.nextDouble();
			if (altura > 0) {
				somaAltura++;
			} else {
				break;
			}
		}

		double media = altura / contador;

		System.out.println("Média de altura: " + media + " metros");
	}

}
