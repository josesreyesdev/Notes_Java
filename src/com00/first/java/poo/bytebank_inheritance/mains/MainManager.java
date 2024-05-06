package com00.first.java.poo.bytebank_inheritance.mains;

import com00.first.java.poo.bytebank_inheritance.model.Manager;

public class MainManager {
    public static void main(String[] args) {
        Manager managerOfficer = new Manager(); //Gerente
        managerOfficer.setName("Josep");
        managerOfficer.setDocument("12321");
        managerOfficer.setSalary(10000.00);
        managerOfficer.setType(1);
        managerOfficer.setKey("CoursesAluraLatam");
        System.out.println("My name is: "+ managerOfficer.getName());
        System.out.println("My number of document is: "+ managerOfficer.getDocument());
        System.out.println("My salary per net is: "+ managerOfficer.getSalary());
        System.out.println("Bonus of 10 percent: "+ managerOfficer.getBonus());
        System.out.println("¿I can login? " + managerOfficer.login("CoursesAluraLatam"));
        System.out.println("¿I can login? " + managerOfficer.login("CoursesAlura"));
    }
}
