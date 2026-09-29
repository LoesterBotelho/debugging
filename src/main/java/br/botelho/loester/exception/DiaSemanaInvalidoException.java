package br.botelho.loester.exception;

public class DiaSemanaInvalidoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DiaSemanaInvalidoException(String mensagem) {
        super(mensagem);
    }
}