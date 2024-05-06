package com00.first.java.exceptions.checked_unchecked;

//Creando una exception
public class MainExceptionUnchecked {
    public static void main(String[] args) {
        System.out.println("Init main");
        method1();
        System.out.println("Fin main");
    }

    private static void method1() {
        System.out.println("Init method1");
        try {
            method2();
        } catch ( MyExceptionUnchecked exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
        System.out.println("Fin method1");
    }

    private static void method2() {
        System.out.println("Init method2");
        //throw new ArithmeticException();
        throw new MyExceptionUnchecked("Mi excepcion fue lanzada");
    }
}
