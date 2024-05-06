package com00.first.java.poo.project_bytebank;

public class TestAccess {
    public static void main(String[] args) {
        Account account = new Account(2342);
        account.deposit(300.0);
        account.withdrawAccountBalance(200.0);
        System.out.println("Balance: " + account.getBalance());
    }
}