package com00.first.java.poo.bytebank_inheritance.inheritance_multiple;


import com00.first.java.poo.bytebank_inheritance.model.Officer;
import com00.first.java.poo.bytebank_inheritance.inheritance_multiple.utils.AuthUtil;

public class Admin extends Officer implements Auth {

    private AuthUtil authUtil;

    public Admin() {
        this.authUtil = new AuthUtil();
    }

    @Override
    public double getBonus() {
        return super.getSalary();
    }

    @Override
    public void setKey(String key) {
        this.authUtil.setPassword(key);
    }

    @Override
    public boolean login(String key) {
        return this.authUtil.login(key);
    }
}
