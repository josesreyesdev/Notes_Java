package com00.first.java.exceptions.checked_unchecked;

public class MainExceptionChecked {
    /* Para usar uan exception extendida de Exception tenemos que checar o notificar a cada metodo
    que recibira una exception y tiene que saber que hacer, a diferencia de una extendida de RuntimeException()
    */
    public static void main(String[] args) {
        System.out.println("Init main");
        try {
            method1();
        } catch (MyExceptionChecked | ArithmeticException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
        System.out.println("Fin main");
    }

    private static void method1() throws MyExceptionChecked {
        System.out.println("Init method1");
        method2();
        System.out.println("Fin method1");
    }

    private static void method2() throws MyExceptionChecked, NullPointerException {
        System.out.println("Init method2");
        //throw new ArithmeticException();
        throw new MyExceptionChecked("Mi excepcion fue lanzada");
    }
}
