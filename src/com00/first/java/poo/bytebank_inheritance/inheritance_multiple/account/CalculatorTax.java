package com00.first.java.poo.bytebank_inheritance.inheritance_multiple.account;

public class CalculatorTax {

    private double totalTax;

    public void register(Tributation tributation) {
        double value = tributation.getTaxValue();
        this.totalTax += value;
    }

    public double getTotalTax() {
        return totalTax;
    }
}
