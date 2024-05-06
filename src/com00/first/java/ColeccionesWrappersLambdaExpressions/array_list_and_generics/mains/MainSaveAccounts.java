package com00.first.java.ColeccionesWrappersLambdaExpressions.array_list_and_generics.mains;

import com00.first.java.ColeccionesWrappersLambdaExpressions.array_list_and_generics.model.SaveAccounts;
import com00.first.java.poo.bytebank_inheritance.model.Account;
import com00.first.java.poo.bytebank_inheritance.model.CheckingAccount;
import com00.first.java.poo.bytebank_inheritance.model.SavingsAccount;

public class MainSaveAccounts {
    public static void main(String[] args) {
        SaveAccounts saveCta = new SaveAccounts();

        Account cta = new SavingsAccount(12, 13);
        Account cc = new CheckingAccount(3, 21);
        Account cta3 = new SavingsAccount(12, 13);

        /*
        saveCta.addAccount(cta);
        saveCta.addAccount(cc);
        saveCta.addAccount(cta);
        saveCta.addAccount(cta3);

        for (int i = 0; i < saveCta.getAllAccounts().length; i++) {
            System.out.println(saveCta.getAllAccounts()[i]);
        }
        System.out.println();
        System.out.println(saveCta.getAccount(11)); */

        /* Guardar cualquier objeto */
        saveCta.addObject(cta);
        saveCta.addObject(cc);
        saveCta.addObject(cta);
        saveCta.addObject(cta3);

        int sizeObjects = saveCta.getAllObjects().length;
        for (int i = 0; i < sizeObjects; i++) {
            System.out.println(saveCta.getAllObjects()[i]);
        }
    }
}