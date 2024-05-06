package jsr1.alura.credits.models;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance; // saldo
    private List<Purchase> purchaseList; // lista de compra

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.purchaseList = new ArrayList<>();
    }

    // lanzar compra
    public boolean launchPurchase(Purchase purchase) {
        if (this.balance >= purchase.getValue()) {
            this.balance -= purchase.getValue();
            this.purchaseList.add(purchase);
            return true;
        } else return false;
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Purchase> getPurchaseList() {
        return purchaseList;
    }
}
