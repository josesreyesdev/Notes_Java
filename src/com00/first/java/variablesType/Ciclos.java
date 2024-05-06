package com00.first.java.variablesType;

public class Ciclos {
    public void cicloWhile() {
        int counter = 1;
        int sum = 0;
        while (counter <= 10) {
            sum += counter;
            System.out.println(counter);
            counter++;
        }
        System.out.println("Suma es: "+ sum);
    }

    public void cicloFor() {

        for (int counter = 1; counter <=10; counter++) {
            System.out.println(counter);
        }
    }

    public void tablaMultiply( int num) {
        int counter = 1;
        int result;
        while (counter <= 10) {
            result = num * counter;
            System.out.println(num + " * " + counter + " = " + result);
            counter++;
        }
        System.out.println();

        for ( int counter2 = 1; counter2 <= 10; counter2++) {
            for (int counter3 = 1; counter3 <= 10; counter3++) {
                System.out.println(counter2 + " * "+ counter3 + " = " + (counter2 * counter3));
            }
            System.out.println();
        }
    }

    public void matriz() {
        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= 10; column++) {
                if (column > row) {
                    break;
                }
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column < row; column++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void multiplosDeTres() {
        for (int number = 1; number <= 100; number++) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }

        System.out.println();

        for (int number = 3; number <= 100; number += 3) {
            System.out.println(number);
        }
    }

    public void factorial(int numFactorial) {
        int facto = 1;
        for ( int n = 1; n <= numFactorial; n++) {
            facto *= n;
            System.out.println( n + " = " + facto);
        }
        System.out.println("Factorial de "+ numFactorial + " = " + facto);
    }
}
