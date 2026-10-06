package br.botelho.loester.exercicios05102026.exercicio2;

public class Exercicio2 {

	public static String verificarEstacao(Integer estacao) {

		String resultado;

		switch (estacao) {
		case 1:
			resultado = "É verão e o tempo está quente.";
			break;

		case 2:
			resultado = "É outono.";
			break;

		case 3:
			resultado = "É inverno e está frio.";
			break;

		case 4:
			resultado = "É primavera.";
			break;
		
		default : resultado = "Estação inválida.";
			break;
		}

		
		if ( estacao < 1 ) {
			throw new IllegalArgumentException("Estação inválida.");
		}
		
		if (estacao > 4) {
			throw new IllegalArgumentException("Estação inválida.");
		}
		
		return resultado;
	}

}
