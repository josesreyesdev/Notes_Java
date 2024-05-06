package com00.first.java.exceptions.checked_unchecked;

public class MainAccountChecked {
    public static void main(String[] args) {
        AccountChecked account = new AccountChecked();
        try {
            account.deposit();
        } catch (MyExceptionChecked exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}
