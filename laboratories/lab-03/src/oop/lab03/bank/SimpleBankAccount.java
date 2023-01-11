package oop.lab03.bank;

import oop.lab03.bank.interfaces.BankAccount;

public class SimpleBankAccount implements BankAccount {

    protected static double ATM_TRANSACTION_FEE = 1;
    private int userID;
    private double balance;
    private int nTransactions;

    public SimpleBankAccount(final int usrID, final double amount) {
        this.userID = usrID;
        this.balance = amount;
        this.nTransactions = 0;
    }

    @Override
    public int getTransactionsCount() {
        return nTransactions;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(final int usrID, final double amount) {
        if (checkUser(usrID)) {
            incrementTransactions();
            this.balance += amount;
        }
    }

    @Override
    public void withdraw(final int usrID, final double amount) {
        if (checkUser(usrID)) {
            incrementTransactions();
            this.balance -= amount;
        }
    }

    @Override
    public void depositFromATM(final int usrID, final double amount) {
        if (checkUser(usrID)) {
            incrementTransactions();
            this.balance += amount - ATM_TRANSACTION_FEE;
        }
    }

    @Override
    public void withdrawFromATM(final int usrID, final double amount) {
        if (checkUser(usrID)) {
            incrementTransactions();
            this.balance -= amount + ATM_TRANSACTION_FEE;
        }
    }

    @Override
    public void chargeManagementFees(final int usrID) {
    }

    protected boolean checkUser(final int id) {
        return this.userID == id;
    }

    @Override
    public void resetTransactionsCount() {
        this.nTransactions = 0;
    }

    @Override
    public void incrementTransactions() {
        this.nTransactions++;
    }

    @Override
    public void decrementBalance(final double amount) {
        this.balance -= amount;
    }
}
