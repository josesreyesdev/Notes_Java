package com00.first.java.ColeccionesWrappersLambdaExpressions.order_list;

import com00.first.java.poo.bytebank_inheritance.model.Account;
import com00.first.java.poo.bytebank_inheritance.model.CheckingAccount;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrderList {
    public static void main(String[] args) {
        Account account1 = new CheckingAccount(22, 33);
        account1.deposit(333.0);

        Account account2 = new CheckingAccount(22, 44);
        account2.deposit(444.0);

        Account account3 = new CheckingAccount(22, 11);
        account3.deposit(111.0);

        Account account4 = new CheckingAccount(22, 22);
        account4.deposit(222.0);

        List<Account> list = new ArrayList<>();
        list.add(account1);
        list.add(account2);
        list.add(account3);
        list.add(account4);

        for (Account ele: list) {
            System.out.println("My element: "+ ele);
        }
        System.out.println();

        /*Order List */
        // Comparator <? extend Account>
        Comparator<Account> comparator = new OrderPerNumberAccount();
        list.sort(comparator);

        /* Esto es apartir de java8  es igual a lo de arriba*/
        // list.sort( new OrderPerNumberAccount());

        for (Account e: list) {
            System.out.println("My element: "+ e);
        }
    }
}

class OrderPerNumberAccount implements Comparator<Account> {

    @Override
    public int compare(Account o1, Account o2) {
        /* FORMA BASICA */
        /*
        if (o1.getNumber() == o2.getNumber()) return 0;
        else if (o1.getNumber() > o2.getNumber()) {
            return 1;
        }
        return -1;*/

        /* FORMA INTERMEDIA */
        // return o1.getNumber() - o2.getNumber();

        /* FORMA WRAPPER */
        return Integer.compare(o1.getNumber(), o2.getNumber());
    }

    @Override
    public Comparator<Account> reversed() {
        return Comparator.super.reversed();
    }
}