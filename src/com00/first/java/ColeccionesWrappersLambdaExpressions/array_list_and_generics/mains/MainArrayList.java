package com00.first.java.ColeccionesWrappersLambdaExpressions.array_list_and_generics.mains;

import com00.first.java.poo.bytebank_inheritance.model.Account;
import com00.first.java.poo.bytebank_inheritance.model.CheckingAccount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {

        ArrayList<Account> list = new ArrayList<>();

        Account cta = new CheckingAccount(1, 2);
        Account cta2 = new CheckingAccount(9, 99);
        Account cta3 = new CheckingAccount(77, 7);
        Account cta4 = new CheckingAccount(33, 3);

        //Agregando
        list.add(cta);
        list.add(cta2);
        list.add(cta3);
        list.add(cta4);
        System.out.println("Size: "+ list.size());

        // Obtener cuentas
        /*for (int i = 0; i < list.size(); i++)  {
            System.out.println("List in ["+i+"] = "+ list.get(i));
        } */
        int counter = 0;
        for (Account account: list) {
            System.out.println("List in ["+ counter++ +"] = "+ account);
        }

        // Eliminando elementos
        System.out.println("Elemento[1] eliminado?: "+ list.remove(1));
        System.out.println("Size: "+ list.size());

        // Definiendo un arrayList de tamaño fijo
        ArrayList<String> secondList = new ArrayList<>(26);
        secondList.add("Hola");
        secondList.add("Hello");
        System.out.println(secondList);

        //lista a partir de otra
        System.out.println();
        ArrayList<String> newList = new ArrayList<>(secondList);
        newList.add("Say");
        System.out.println(newList);

        // Convertir un array a un arrayList
        List<String> arguments = Arrays.asList(args);
    }
}