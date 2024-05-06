package com00.first.java.objects_strings;

import com00.first.java.poo.bytebank_inheritance.model.CheckingAccount;
import com00.first.java.poo.bytebank_inheritance.model.SavingsAccount;

public class MainSystem {
    public static void main(String[] args) {
        String ex = "Hello";
        printLine(ex);

        //muestra el valor en la memoria con toString() a menos que se sobreescriba en la clase principal.
        System.out.println(ex.toString());

        // Llamada a toStrings de cada instancia
        Object cc = new SavingsAccount(22, 33);
        Object cp = new CheckingAccount(33, 22);
        System.out.println(cc);
        System.out.println(cp);
    }

    /* Reemplazar la Sobrecarga con Object ya que todas heredan de Object*/
    public static void printLine(Object value) {
        System.out.println(value);
    }
    /*
    * public static void printLine(String value) {
    *       System.out.println(value);
    * }
    *
    * public static void printLine(int value) {
     *     System.out.println(value);
     * }
     *
     * public static void printLine(String value) {
     *      System.out.println(value);
     * }
     *  */
}
