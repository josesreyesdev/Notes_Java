package com00.first.java.ColeccionesWrappersLambdaExpressions.vectors;

import poo.bytebank_inheritance.model.Account;
import poo.bytebank_inheritance.model.Client;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class MainVectors {
    public static void main(String[] args) {
        List<Client> clients = new LinkedList<>();
        List<Account> list = new ArrayList<>();

        //Vector = Hace lo mismo que cualquier lista pero es thread safe, ya casi no se usa por el performance
        List<Account> vectorList = new Vector<>();
    }
}
