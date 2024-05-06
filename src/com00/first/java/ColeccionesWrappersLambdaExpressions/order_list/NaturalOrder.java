package com00.first.java.ColeccionesWrappersLambdaExpressions.order_list;

//import org.jetbrains.annotations.NotNull;
import com00.first.java.poo.bytebank_inheritance.model.Account;
import com00.first.java.poo.bytebank_inheritance.model.CheckingAccount;

import java.util.*;

public class NaturalOrder {
    public static void main(String[] args) {

        List<Account> list = getAccountList();
        for (Account ele: list) {
            System.out.println("List: "+ ele);
        }
        System.out.println();

        /* Ordenar por medio del Collection esto en versiones anteriores a java8*/
        /*
        Collections.sort(list, new OrderAccounts());
        for (Account ele: list) {
            System.out.println("List: "+ ele);
        } */

        /* Esto es apartir de java8 */
        //list.sort( new OrderAccounts());

        /* Ordenamiento natural */
        Collections.sort(list);
        for (Account ele: list) {
            System.out.println("List: "+ ele);
        }

        /* Invertir el orden de la lista*/
        Collections.reverse(list);

        /* Mezclar los elementos de mi lista */
        Collections.shuffle(list);

        /* Girar los elementos mi lista */
        Collections.rotate(list, 5); // rotar 5 posiciones

        /* Ordenamiento de un Array */
        int[] numbers = new int[] {43, 15, 15, 63, 7, 86};
        System.out.println("Numbers "+ Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Numbers "+ Arrays.toString(numbers));
    }

    //@NotNull
    private static List<Account> getAccountList() {
        Account account1 = new CheckingAccount(19, 33);
        account1.deposit(333.0);

        Account account2 = new CheckingAccount(20, 44);
        account2.deposit(444.0);

        Account account3 = new CheckingAccount(2, 11);
        account3.deposit(111.0);

        Account account4 = new CheckingAccount(3, 22);
        account4.deposit(222.0);

        List<Account> list = new ArrayList<>();
        list.add(account1);
        list.add(account2);
        list.add(account3);
        list.add(account4);
        return list;
    }
}

class OrderAccounts implements Comparator<Account> {

    @Override
    public int compare(Account o1, Account o2) {
        return o1.getNumber() - o2.getNumber();
    }
}
