package com00.first.java.poo;

import poo.project_bytebank.Account;

public class CreateAccount {
    public static void main(String[] args) {

        Account account = new Account(3443);
        account.deposit( (double)1000 );
        System.out.println(account.getBalance());

        Account account2 = new Account(2342);
        account2.deposit( (double) 1500 );
        System.out.println(account2.getBalance());
    }
}