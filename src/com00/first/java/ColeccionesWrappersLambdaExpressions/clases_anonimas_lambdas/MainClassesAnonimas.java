package com00.first.java.ColeccionesWrappersLambdaExpressions.clases_anonimas_lambdas;

import poo.bytebank_inheritance.model.Account;
import poo.bytebank_inheritance.model.CheckingAccount;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainClassesAnonimas {
    public static void main(String[] args) {
        Account account1 = new CheckingAccount(19, 33);
        account1.deposit(333.0);

        Account account2 = new CheckingAccount(20, 44);
        account2.deposit(444.0);

        Account account3 = new CheckingAccount(2, 11);
        account3.deposit(111.0);

        Account account4 = new CheckingAccount(3, 22);
        account4.deposit(222.0);

        List<Account> list = new ArrayList<>();
        list.add(account1);
        list.add(account2);
        list.add(account3);
        list.add(account4);

        /* Clase anonima */
        list.sort(new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return Integer.compare(o1.getNumber(), o2.getNumber());
            }
        });
    }
}
