package com00.first.java.ColeccionesWrappersLambdaExpressions.array_list_and_generics.model;

import poo.bytebank_inheritance.model.Account;

public class SaveAccounts {
    /*
    * Que debe permitir esta clase?:
    * 1.- Crear un obj para guardar muchas cts.
    * 2.- Permitir guardar cts con un metodo
    * 3.- Borrar una cta
    * 4.- Editar una cta
    * 5.-
    * */

    Account[] accounts = new Account[10];
    int index = 0;

    public Account getAccount(int index) {
        return accounts[index];
    }
    public Account[] getAllAccounts() {
        return accounts;
    }
    public void addAccount(Account cta) {
        if (index >= 0 && index < accounts.length) {
            accounts[index] = cta;
        } else  {
            System.out.println("No puedo agregar mas cuentas");
        }
        index++;
        System.out.println("Mi index:" + index);
    }

    /*Guardar cualquier tipo de cuenta*/
    Object[] myObjects = new Object[10];

    public Object getObject(int index) {
        return myObjects[index];
    }
    public Object[] getAllObjects() {
        return myObjects;
    }
    public void addObject(Object obj) {
        if (index >= 0 && index < myObjects.length) {
            myObjects[index] = obj;
        } else  {
            System.out.println("No puedo agregar mas cuentas");
        }
        index++;
        System.out.println("Mi index:" + index);
    }
}
