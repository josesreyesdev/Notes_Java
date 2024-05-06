package com00.first.java.ColeccionesWrappersLambdaExpressions.order_list;

import poo.bytebank_inheritance.model.Account;
import poo.bytebank_inheritance.model.CheckingAccount;
import poo.bytebank_inheritance.model.Client;
import poo.bytebank_inheritance.model.SavingsAccount;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrderListPerTitular {
    public static void main(String[] args) {
        Account account1 = new CheckingAccount(22, 33);
        Client clientAccount1 = new Client();
        clientAccount1.setHolderName("Diego");
        account1.setHolder(clientAccount1);
        account1.deposit(333.0);

        Account account2 = new SavingsAccount(22, 44);
        Client clientAccount2 = new Client();
        clientAccount2.setHolderName("Renato");
        account2.setHolder(clientAccount2);
        account2.deposit(444.0);

        Account account3 = new CheckingAccount(22, 11);
        Client clientAccount3 = new Client();
        clientAccount3.setHolderName("Liam");
        account3.setHolder(clientAccount3);
        account3.deposit(111.0);

        Account account4 = new SavingsAccount(22, 22);
        Client clientAccount4 = new Client();
        clientAccount4.setHolderName("Noel");
        account4.setHolder(clientAccount4);
        account4.deposit(222.0);


        List<Account> list = new ArrayList<>();
        list.add(account1);
        list.add(account2);
        list.add(account3);
        list.add(account4);

        for (Account el: list) {
            System.out.println("Account: "+ el);
        }
        System.out.println();

        // Order per Holder Name
        Comparator<Account> comparator = new OrderPerHolderName();
        list.sort(comparator);
        for (Account el: list) {
            System.out.println("Account: "+ el);
        }

    }
}

class OrderPerHolderName implements Comparator<Account> {

    @Override
    public int compare(Account o1, Account o2) {
        //Orden alfabetico, D, L, N, R
        return o1.getHolder().getHolderName().compareTo(o2.getHolder().getHolderName());
    }
}