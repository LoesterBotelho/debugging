package br.botelho.loester.exception;

public class AlturaInvalidaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AlturaInvalidaException(String mensagem) {
        super(mensagem);
    }
}