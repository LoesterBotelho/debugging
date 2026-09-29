package br.botelho.loester;

import java.util.Scanner;

import br.botelho.loester.exercicios.Ex1;

public class MenuExecutor {

    private final Scanner scanner = new Scanner(System.in);
    private final String divisoria = "-----------------------------------------------------------------------------------------------------------------------------------";
    
    public void executar() {

        int opcao;

        do {
            exibirMenu();

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> executarExercicio1();
                case 2 -> executarExercicio2();
                case 3 -> executarExercicio3();
                case 0 -> executarSair();
                default -> executarOpcaoInvalida();
            }

        } while (opcao != 0);

        scanner.close();
    }

    private void exibirMenu() {
        System.out.println();
        System.out.println(divisoria);
        System.out.println("          DEBUGGING (Esse é o nome do projeto, não significa que está debugando, XD deveria ter escolhido outro nome.)");
        System.out.println(divisoria);
        System.out.println("1 - Exercício 1");
        System.out.println("2 - Exercício 2");
        System.out.println("3 - Exercício 3");
        System.out.println("0 - Sair");
        System.out.println(divisoria);
        System.out.print("Digite uma opção : ");
    }

    private void executarSair() {
    	System.out.println("Encerrando aplicação...");
    	System.out.println(divisoria);
    }
    
    private void executarOpcaoInvalida() {
    	System.out.println(divisoria);
    	System.out.println("Opção inválida.");
    	System.out.println(divisoria);
    }
    
    private void executarExercicio1() {
    	System.out.println(divisoria);
        System.out.println("Executando Exercício 1...\n");
        Ex1 ex1 = new Ex1(); 
        ex1.executar(scanner);  
    }

    private void executarExercicio2() {
    	System.out.println(divisoria);
        System.out.println("Executando Exercício 2...\n");
    }

    private void executarExercicio3() {
    	System.out.println(divisoria);
        System.out.println("Executando Exercício 3...\n");
    }
    

}