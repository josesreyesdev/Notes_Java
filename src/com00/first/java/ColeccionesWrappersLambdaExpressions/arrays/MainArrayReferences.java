package com00.first.java.ColeccionesWrappersLambdaExpressions.arrays;

import poo.bytebank_inheritance.model.CheckingAccount;

import java.util.Arrays;

public class MainArrayReferences {
    public static void main(String[] args) {

        CheckingAccount[] checkingAccounts = new CheckingAccount[5];
        checkingAccounts[0] = new CheckingAccount(23, 44);
        checkingAccounts[2] = new CheckingAccount(33, 54);
        checkingAccounts[4] = new CheckingAccount(29, 42);

        System.out.println();
        for (CheckingAccount checkingAccount : checkingAccounts) {
            System.out.println(checkingAccount);
        }

        System.out.println();
        System.out.println("Agency position 2 is: " + checkingAccounts[2].getAgency()); // Agency position 2 is: 33
        //System.out.println("Agency position 3 is: "+ checkingAccounts[3].getAgency()); // NullPointerException

        System.out.println();
        int[] ages = new int[5];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = i * i;
        }
        System.out.println(Arrays.toString(ages)); // [0, 1, 4, 9, 16]

        int[] ages2 = new int[5];
        for (int i: ages2) {
            ages2[i] = i * i;
        }
        System.out.println(Arrays.toString(ages2)); // [0, 0, 0, 0, 0]
    }
}
