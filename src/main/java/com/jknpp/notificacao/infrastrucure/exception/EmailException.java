package com.jknpp.notificacao.infrastrucure.exception;

public class EmailException extends RuntimeException {
    public EmailException(String message, Throwable cause) {
        super(message);
    }
}
