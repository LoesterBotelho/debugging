package br.botelho.loester.exception;

public class EntradaAlturaInvalidaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EntradaAlturaInvalidaException(String mensagem) {
        super(mensagem);
    }
}