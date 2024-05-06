package com00.first.java.poo.bytebank_inheritance.example_conexion;

public class Connection implements AutoCloseable {
    public Connection() {
        System.out.println("Opening connection");
    }

    public void reedData() {
        System.out.println("Receiving data");
        throw new IllegalStateException();
    }

    public void closeConnection() {
        System.out.println("Closing connection");
    }

    @Override
    public void close() throws Exception {
        closeConnection();
    }
}
