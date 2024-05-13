package com.alura.movies.exceptions;

public class ErrorToConvertDurationException extends RuntimeException {

    private final String message;

    public ErrorToConvertDurationException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
