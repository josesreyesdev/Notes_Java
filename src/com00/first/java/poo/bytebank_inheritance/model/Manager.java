package com00.first.java.poo.bytebank_inheritance.model;

import com00.first.java.poo.bytebank_inheritance.inheritance_multiple.Auth;
import com00.first.java.poo.bytebank_inheritance.inheritance_multiple.utils.AuthUtil;

import java.util.Objects;

public class Manager extends Officer implements Auth { //Gerente

    private String password;
    private AuthUtil authUtil;

    public Manager() {
        this.authUtil = new AuthUtil();
    }

    @Override
    public void setKey(String key) {
        this.authUtil.setPassword(key);
    }

    @Override
    public boolean login(String key) {
        return this.authUtil.login(key);
    }

    //Sobre-escritura del metodo
    public double getBonus() {
        return super.getSalary() + this.getSalary() * 0.05;
    }

    //Sobre-carga
    public boolean auth( String password) {
        return Objects.equals(this.password, password);
    }

    public boolean auth( String login, String password) {
        return Objects.equals(this.password, password);
    }
}
