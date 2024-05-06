package com00.first.java.exceptions;

public class Flow {
    public static void main(String[] args) {
        System.out.println("Init do main");
        method1();
        System.out.println("Fin do main");
    }

    private static void method1() {
        System.out.println("Init do method1");
        method2();
        System.out.println("Fin do method1");
    }

    private static void method2() {
        System.out.println("Init do method2");
        for (int i = 1; i <= 5; i++ ) {
            System.out.println(i);
            try {
                /*
                int number = 0;
                int result =  i / number;
                System.out.println(result);
                */
                String test = null;
                System.out.println(test.toCharArray());
            } catch ( Exception ex) /* catch(ArithmeticException | NullPointerException ex) */{
                //System.out.println("Exeption: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        System.out.println("Fin do method2");
    }
}
/*
Init do main
Init do method1
Init do method2
1
2
3
4
5
Fin do method2
Fin do method1
Fin do main
* */