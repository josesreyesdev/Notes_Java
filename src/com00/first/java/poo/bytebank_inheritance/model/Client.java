package com00.first.java.poo.bytebank_inheritance.model;

import com00.first.java.poo.bytebank_inheritance.inheritance_multiple.Auth;
import com00.first.java.poo.bytebank_inheritance.inheritance_multiple.utils.AuthUtil;

import java.util.Objects;

public class Client implements Auth {

    private String holderName; //titular
    private String document;
    private String phoneNumber;
    private AuthUtil authUtil;

    public Client() {
        this.authUtil = new AuthUtil();
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }


    @Override
    public void setKey(String key) {
        this.authUtil.setPassword(key);
    }

    @Override
    public boolean login(String key) {
        return this.authUtil.login(key);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
