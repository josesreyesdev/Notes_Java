package com00.first.java.poo.project_bytebank;

public class TestEncapsulation {
    public static void main(String[] args) {
        Account account = new Account(123);
        account.deposit(2500.0);
        Client client = new Client();
        client.setHolderName("Diego");
        client.setDocument("Aqwzfqqwe131212");

        account.setHolder(client);
        Client client2 = account.getHolder();

        System.out.println("Client: " + client.getHolderName());
        System.out.println("Client: " + account.getHolder().getHolderName());
        System.out.println("Client: " + client2.getHolderName());
    }
}