package com00.first.java.poo.bytebank_inheritance.inheritance_multiple;

public class InternalSystem {
    public void authUser(Auth auth) {
        String password = "CoursesAluraOnline";
        boolean youCanLogin = auth.login(password);
        if (youCanLogin) {
            System.out.println("Login success");
        } else System.out.println("Login error");
    }
}
