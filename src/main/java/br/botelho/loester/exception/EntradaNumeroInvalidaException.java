package br.botelho.loester.exception;

public class EntradaNumeroInvalidaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EntradaNumeroInvalidaException(String mensagem) {
        super(mensagem);
    }
}