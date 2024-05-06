package com00.first.java.poo.project_bytebank;

public class TestReferenceClient {
    public static void main(String[] args) {
        Client diego = new Client();
        diego.setHolderName("Diego");
        diego.setDocument("434525432");
        diego.setPhoneNumber("1234567891");

        Account diegoAccount = new Account(342);
        diegoAccount.setHolder(diego);
        System.out.println("Diego account with number of document: " + diegoAccount.getHolder().getDocument());
        System.out.println("Diego account with phone number: " + diegoAccount.getHolder().getPhoneNumber());

        System.out.println("-----------------------------------------------------------");
        Account joseAccount = new Account(568);
        System.out.println("Jose account, name: " + joseAccount.getHolder());

        Client jose = new Client();
        joseAccount.setHolder(jose);
        joseAccount.getHolder().setHolderName("Jose S. Reyes");
        joseAccount.getHolder().setDocument("44444411111111114");
        joseAccount.getHolder().setPhoneNumber("4092129301");
        System.out.println("Jose account, name: " + joseAccount.getHolder().getHolderName());
        System.out.println("Jose account, document number: " + joseAccount.getHolder().getDocument());
        System.out.println("Jose account, phone number: " + joseAccount.getHolder().getPhoneNumber());
    }
}