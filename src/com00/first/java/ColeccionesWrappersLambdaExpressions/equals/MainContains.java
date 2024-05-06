package com00.first.java.ColeccionesWrappersLambdaExpressions.equals;

import com00.first.java.poo.bytebank_inheritance.model.Account;
import com00.first.java.poo.bytebank_inheritance.model.CheckingAccount;

import java.util.ArrayList;

public class MainContains {
    public static void main(String[] args) {
        ArrayList<Account> list = new ArrayList<>();
        Account cc = new CheckingAccount(12, 13);
        Account cc1 = new CheckingAccount(22, 23);
        Account cc2 = new CheckingAccount(12, 13);
        list.add(cc);

        //Verificar si contiene algun elemento comparando la referencia
        if (list.contains(cc1)) System.out.println("Si lo contiene");
        else System.out.println("No lo contiene");

        System.out.println();

        // Verificar si contiene un elementode acuerdo a sus valores
        if (cc.equals(cc2)) System.out.println("Es igual");
        else System.out.println("No es igual");
    }
}
