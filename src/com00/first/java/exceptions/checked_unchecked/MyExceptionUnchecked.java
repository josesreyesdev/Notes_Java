package com00.first.java.exceptions.checked_unchecked;

public class MyExceptionUnchecked extends RuntimeException{
    public MyExceptionUnchecked() {
        super();
    }

    public MyExceptionUnchecked(String message) {
        super(message);
    }
}
