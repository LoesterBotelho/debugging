package br.botelho.loester.exception;

public class HoraInvalidaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public HoraInvalidaException(String mensagem) {
        super(mensagem);
    }
}