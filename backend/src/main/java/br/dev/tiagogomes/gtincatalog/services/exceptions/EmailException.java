package br.dev.tiagogomes.gtincatalog.services.exceptions;

@SuppressWarnings("serial")
public class EmailException extends RuntimeException {

	public EmailException(String msg) {
		super(msg);
	}
}
