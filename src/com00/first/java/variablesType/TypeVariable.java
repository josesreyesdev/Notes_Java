package com00.first.java.variablesType;

public class TypeVariable {
    public void variable() {

        //Integers
        int age = 27;
        //System.out.println("Mi age is: "+ age + " years old");
        age = 28;
        System.out.println("Mi age is: " + age + " years old");

        // Long =>
        long prueba =  1412453234353435432L;

        //Short => small numbers 2^16
        short smallNumber= 2342;

        // Byte
        byte smallNumberThanShort = 2;

        // Decimals
        double salary = 1250.55;
        System.out.println("Salary: " + salary);

        double division = 5.0/2;
        System.out.println (division);

        // Float
        float smallDecimal = 2.5F;

        //Convert variables types
        double variableDouble =  (double) age * 2; //cast
        System.out.println(variableDouble);

        // Char
        char letter = 'A';
        letter = 'c';
        letter = 65;
        System.out.println(letter);

        char chracter2 = (char) (letter + 1);

        //Strings
        String name = "Josep";
        System.out.println("My name is: " + name);

    }
}
