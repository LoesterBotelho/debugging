package br.botelho.loester.explicacao;

import java.util.Scanner;

public class MainTestes2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o seu nome : ");
		String nome = sc.next();
		
		System.out.println("Insira sua idade : ");
		Integer idade = sc.nextInt();
		
		System.out.println("Ola, " + nome + "Sua idade é " + idade); 
		
		sc.close();
	}
}
