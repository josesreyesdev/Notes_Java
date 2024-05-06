package com00.first.java.poo.project_bytebank;

public class TestMethods {

    public static void main(String[] args) {
        Account account = new Account(143);
        account.deposit(200.0);
        if (account.withdrawAccountBalance(50.0)) {
            System.out.println("Withdraw account balance success");
        }
        System.out.println("Balance: " + account.getBalance());

        account.deposit(100.0);
        System.out.println("Balance: " + account.getBalance());

        Account accountJimena = new Account(3333333);
        accountJimena.deposit(1000.0);
        System.out.println("Balance Jimena: " + accountJimena.getBalance());
        accountJimena.transfer(400.0, account);
        System.out.println("Balance Jimena: " + accountJimena.getBalance());

        System.out.println("My Balance: " + account.getBalance());

    }
}
