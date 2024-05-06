package com00.first.java.poo.bytebank_inheritance.model;

//import org.jetbrains.annotations.NotNull;
import com00.first.java.poo.bytebank_inheritance.exception.InsufficientBalanceException;

/**
 * Class account
 * @version 1.0
 * @author Jose
 */
public abstract class Account implements Comparable<Account> {
    protected double balance;
    private int agency = 1;
    private int number;
    private Client holder; //titular

    private static int totalAccounts = 0;

    /**
     * Instancia una cuenta usando agencia y numero
     * @param agency
     * @param number
     */
    public Account(int agency, int number) {
        if (agency < 1 || number < 1) {
            this.agency = 1;
            this.number = 0;
            System.out.println("No se permite valores menores a 1");
            throw new IllegalArgumentException("Invalid agency or invalid number");
        } else  {
            this.agency = agency;
            this.number = number;
        }
        totalAccounts++;
        System.out.println("Total Accounts: "+ totalAccounts);
    }

    public abstract void deposit(Double balance);

    /**
     * Este metodo retira dinero de la cuenta y si ocurre un error muestra un error
     * @param balance
     * @throws InsufficientBalanceException
     */
    public void withdrawAccountBalance(Double balance) throws InsufficientBalanceException{ //retirar

        if (this.balance < balance) {
            throw new InsufficientBalanceException("Saldo Insuficiente, tienes: $" + this.getBalance());
        }
        this.balance -= balance;
    }

    public boolean transfer(Double balance, Account account) {
        if (isValidBalance(balance)) {
            account.deposit(balance);
            try {
                withdrawAccountBalance(balance);
            } catch (InsufficientBalanceException e) {
                throw new RuntimeException(e);
            }
            //this.balance -= balance;
            return true;
        } else {
            System.out.println("Sorry, you don´t have enough money in your account for to transfer!");
            return false;
        }
    }

    private boolean isValidBalance(Double balance) {
        return this.balance >= balance && balance > 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public Client getHolder() {
        return holder;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    @Override
    public String toString() {
        return "Number: " + this.number + ", Agency: " + this.agency /* + ", Name: " + this.holder.getHolderName()*/;
    }

    @Override
    public boolean equals(Object obj) {
        Account cta = (Account) obj;
        return this.agency == cta.getAgency() &&
                this.number == cta.getNumber();
    }

    @Override
    public int compareTo(/*@NotNull */ Account o) {
        /* Orden natural: Numero de Agencia */
        // return Integer.compare(this.agency, o.getAgency());

        /* Orden natural: Balance o saldo */
        return Double.compare(this.getBalance(), o.getBalance());
    }
}