package com00.first.java.poo.bytebank_inheritance.mains;

import poo.bytebank_inheritance.model.CheckingAccount;
import poo.bytebank_inheritance.model.SavingsAccount;

public class MainAccount {
    public static void main(String[] args) {
        CheckingAccount cc = new CheckingAccount(1, 1); //Cuenta corriente
        SavingsAccount ca = new SavingsAccount(2, 3);

        cc.deposit(2000.0);
        cc.transfer(1000.0, ca);
        System.out.println("Cuenta Corriente: "+cc.getBalance());
        System.out.println("Cuenta de Ahorro: "+ca.getBalance());
    }
}
