package com00.first.java.ColeccionesWrappersLambdaExpressions.wrappers;

public class MainWRappersTwo {
    public static void main(String[] args) {

        int number = 33;

        Double doubleNumber = 33.0;
        Boolean verdadero = true;
        Double numberDouble2 = Double.valueOf(number); //33.0
        System.out.println(numberDouble2);

        String stringNumber = "43";
        Double stringDouble = Double.valueOf(stringNumber);
        Integer integerString =  Integer.valueOf(stringNumber);

        System.out.println(stringDouble);
        System.out.println(integerString);

        // Casi todos exienden de Number por eso podría hacer lo sig:
        Number num = Integer.valueOf(number);
        System.out.println(num);

        double numDouble = num.doubleValue();
    }
}
