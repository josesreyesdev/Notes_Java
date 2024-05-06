package jsr1.alura.credits.main;

import jsr1.alura.credits.models.CreditCard;
import jsr1.alura.credits.models.Purchase;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el saldo límite de tú tarjeta: ");
        double limit = scanner.nextDouble();

        CreditCard credit = new CreditCard(limit);

        int exit = 1;
        while (exit != 0) {
            System.out.println("Escriba la descripción de la compra: ");
            String description = scanner.next();

            System.out.println("Escriba el valor de la compra: ");
            double value = Double.parseDouble(scanner.next());

            Purchase purchase = new Purchase(value, description);
            boolean purchaseMade = credit.launchPurchase(purchase);

            if (purchaseMade) {
                System.out.println("Compra realizada!");
                System.out.println("Escriba 0 para salir ó 1 para continuar: ");
                exit = scanner.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                exit = 0;
            }
        }

        System.out.println("****************************");
        System.out.println("COMPRAS REALIZADAS: \n");

        Collections.sort(credit.getPurchaseList());

        credit.getPurchaseList().forEach(purchase ->
                System.out.println(purchase.getDescription() + " - $" + purchase.getValue())
        );

        System.out.println("\nSaldo de la tarjeta: " + credit.getBalance());
    }
}
