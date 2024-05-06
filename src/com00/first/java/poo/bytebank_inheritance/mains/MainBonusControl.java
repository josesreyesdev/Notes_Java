package com00.first.java.poo.bytebank_inheritance.mains;

import poo.bytebank_inheritance.model.Accountant;
import poo.bytebank_inheritance.model.BonusControl;
import poo.bytebank_inheritance.model.Manager;
import poo.bytebank_inheritance.model.Officer;

public class MainBonusControl {
    public static void main(String[] args) {
        Officer diego = new Accountant();
        diego.setSalary(2000.0);

        Manager jimena = new Manager();
        jimena.setSalary(10000.0);

        Accountant alexis = new Accountant();
        alexis.setName("Alexis");
        alexis.setSalary(5000.0);

        BonusControl control = new BonusControl();
        control.recordSalary(diego);
        control.recordSalary(jimena);
        control.recordSalary(alexis);

        System.out.println(control.getSum());
    }
}
