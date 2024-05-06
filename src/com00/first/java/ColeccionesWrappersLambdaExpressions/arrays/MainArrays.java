package com00.first.java.ColeccionesWrappersLambdaExpressions.arrays;

import java.util.Arrays;

public class MainArrays {
    /*
    * java.lang => contiene clases que no necesitamos importar directamente como System, String.
    * java.utils => contiene onjetos utilitarios para simplificar tareas
    * java.io => contiene librerias generalmentepara leer archivos, strings de datos, etc.
    * */
    public static void main(String[] args) {
        int age = 20;
        int age2 = 15;
        int age3 = 45;

        int[] ages = new int[5];
        System.out.println(Arrays.toString(ages)); // [0, 0, 0, 0, 0]
        ages[0] = age;
        ages[1] = age2;
        ages[2] = age3;
        ages[3] = age;
        ages[4] = age2;
        System.out.println("My array is: " + Arrays.toString(ages)); // My array is: [20, 15, 45, 20, 15]
        System.out.println("The position[2] of array is: " + ages[2]); // The position[2] of array is: 45
        try {
            System.out.println("The position[2] of array is: " + ages[5]); // Exceptions ArrayIndexOutOfBoundsException
        }catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error at the position[5]: "+ ex);
        }
        System.out.println("Size of ages: "+ ages.length);
        System.out.println();
        int sum = 0;
        //For
        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];
            System.out.println("Element in the position["+i+"] is: " + ages[i]);
        }
        System.out.println("Sum of ages is: "+ sum);

    }
}
