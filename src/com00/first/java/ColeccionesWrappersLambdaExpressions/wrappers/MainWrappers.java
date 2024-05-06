package com00.first.java.ColeccionesWrappersLambdaExpressions.wrappers;

import java.util.ArrayList;
import java.util.List;

public class MainWrappers {
    public static void main(String[] args) {
        /* REPASO */

        //Arreglos
        int[] numbers = new int[5]; //valor primitivo

        int number = 40;
        // WRAPPER => da la facilidad de convertir a un tipo primitivo
        //Integer objectNumber = new Integer(40); // pero ya está deprecado podemos sustituir con:
        Integer numeroObj = Integer.valueOf(40); // mas reducido es
        Integer numeroOnj2 = 40;

        // List => acepta un generic, no puede haber una lista de primitivos como Int
        List<Integer> list = new ArrayList<>();

        // primitivo != object
        list.add(number); //valor del object por referencia, por lo tanto hace un:
        // autoboxing que es pasar un valor primitivo a objeto
        //list.add(new Integer(40));

        //unBoxing = pasar un objeto a primitivo
        //int valorPrimitivo = numeroOnj2.intValue();
        int valorPrimitivo = numeroOnj2;

        byte byteNumber = numeroOnj2.byteValue();
        double doubleNumber = numeroOnj2.doubleValue();
        float floatNumber = numeroOnj2.floatValue();

        System.out.println("Byte: "+ byteNumber+" \nDouble: "+ doubleNumber+ " \nFloat: "+ floatNumber );
        System.out.println(" Number List: "+ list);
        System.out.println();

        //Valores del Integer
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Integer.SIZE);      // 32
        System.out.println(Integer.BYTES);     // 4

    }
}
