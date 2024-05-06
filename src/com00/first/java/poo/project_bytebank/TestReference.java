package com00.first.java.poo.project_bytebank;

public class TestReference {
    public static void main(String[] args) {
        Account firstAccount = new Account(86);
        System.out.println("First Account "+ firstAccount.getBalance());

        Account secondAccount = firstAccount;
        System.out.println("Second Account "+ secondAccount.getBalance());
        System.out.println("First Account " + firstAccount.getBalance());

        System.out.println(firstAccount);
        System.out.println(secondAccount);
    }
}
