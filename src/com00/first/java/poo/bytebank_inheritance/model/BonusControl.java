package com00.first.java.poo.bytebank_inheritance.model;

public class BonusControl {
    private double sum;
    public void recordSalary( Officer officer) { //registrar salario
        this.sum += officer.getBonus();
    }

    public double getSum() {
        return this.sum;
    }
}
