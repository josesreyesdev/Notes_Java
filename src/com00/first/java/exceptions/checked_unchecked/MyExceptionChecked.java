package com00.first.java.exceptions.checked_unchecked;

public class MyExceptionChecked extends Exception{
    public MyExceptionChecked() {
        super();
    }

    public MyExceptionChecked(String message) {
        super(message);
    }
}
