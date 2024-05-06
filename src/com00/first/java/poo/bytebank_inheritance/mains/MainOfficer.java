package com00.first.java.poo.bytebank_inheritance.mains;

import poo.bytebank_inheritance.model.Accountant;
import poo.bytebank_inheritance.model.Officer;

public class MainOfficer {
    public static void main(String[] args) {
        Officer diegoOfficer = new Accountant(); //Funcionario
        diegoOfficer.setName("Diego");
        diegoOfficer.setDocument("34235235");
        diegoOfficer.setSalary(5000.00);
        diegoOfficer.setType(0);
        System.out.println("My name is: "+ diegoOfficer.getName());
        System.out.println("My number of document is: "+ diegoOfficer.getDocument());
        System.out.println("My salary per net is: "+ diegoOfficer.getSalary());
        System.out.println("Bonus: "+ diegoOfficer.getBonus());
    }
}
