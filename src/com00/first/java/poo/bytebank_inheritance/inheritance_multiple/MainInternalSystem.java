package com00.first.java.poo.bytebank_inheritance.inheritance_multiple;

import com00.first.java.poo.bytebank_inheritance.model.Manager;

public class MainInternalSystem {
    public static void main(String[] args) {

        InternalSystem internalSystem = new InternalSystem();

        Manager manager = new Manager();
        Admin admin = new Admin();

        internalSystem.authUser((Auth) manager);
        internalSystem.authUser(admin);
    }
}