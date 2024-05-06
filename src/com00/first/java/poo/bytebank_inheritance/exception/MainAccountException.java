package com00.first.java.poo.bytebank_inheritance.exception;

import com00.first.java.poo.bytebank_inheritance.model.Account;
import com00.first.java.poo.bytebank_inheritance.model.SavingsAccount;

public class MainAccountException {
    public static void main(String[] args) {
        Account account = new SavingsAccount(123, 456);
        account.deposit(200.0);
        account.withdrawAccountBalance(250.0);
    }
}
