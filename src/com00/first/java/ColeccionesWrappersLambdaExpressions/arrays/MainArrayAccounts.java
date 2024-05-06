package com00.first.java.ColeccionesWrappersLambdaExpressions.arrays;

import com00.first.java.poo.bytebank_inheritance.model.*;

import java.util.Arrays;

public class MainArrayAccounts {
    public static void main(String[] args) {
        Account[] accounts = new Account[5];
        accounts[0] = new CheckingAccount(3, 4);
        accounts[1] = new CheckingAccount(33, 44);
        accounts[2] = new SavingsAccount(11, 22);
        accounts[3] = new SavingsAccount(44, 444);
        accounts[4] = new SavingsAccount(2, 3);
        System.out.println(Arrays.toString(accounts));

        //Cast
        CheckingAccount ca = (CheckingAccount) accounts[0];
        System.out.println(ca);
        System.out.println();

        //references
        Object[] references = new Object[7];
        references[0] = accounts;
        references[1] = ca;
        references[2] = new Client();
        references[3] = new SavingsAccount(12, 43);
        references[4] = new Manager();
        references[5] = new Accountant();
        references[6] = new CheckingAccount(54, 45);
        for (Object reference : references) {
            System.out.println(reference);
        }
    }
}
