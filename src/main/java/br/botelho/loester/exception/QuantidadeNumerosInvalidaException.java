package br.botelho.loester.exception;

public class QuantidadeNumerosInvalidaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public QuantidadeNumerosInvalidaException(String mensagem) {
        super(mensagem);
    }
}