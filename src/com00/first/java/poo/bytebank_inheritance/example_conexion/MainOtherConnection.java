package com00.first.java.poo.bytebank_inheritance.example_conexion;

public class MainOtherConnection {
    public static void main(String[] args) throws Exception {
        /*
        Connection connection = null;
        try {
            connection = new Connection();
            connection.reedData();
        } catch (IllegalStateException ex) {
            System.out.println("Receiving exception");
            ex.printStackTrace();
        } finally {
            System.out.println("Closing connection in finally");
            if (connection != null) {
                connection.closeConnection();
            }
        } */

        try (Connection connection = new Connection()) {
            connection.reedData();
        } catch (IllegalStateException ex) {
            System.out.println("Catch execute");
            ex.printStackTrace();
        }
    }
}
