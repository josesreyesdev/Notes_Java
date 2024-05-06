package com00.first.java.poo.bytebank_inheritance.example_conexion;

public class MainConnection {

    public static void main(String[] args) {

        Connection connection = new Connection();
        try {
            connection.reedData();
        } catch (IllegalStateException ex) {
            System.out.println("Receiving exception");
            ex.printStackTrace();
        } finally {
            System.out.println("Closing connection in finally");
            connection.closeConnection();
        }
    }
}
