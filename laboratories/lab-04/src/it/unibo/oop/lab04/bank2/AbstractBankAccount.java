package it.unibo.oop.lab04.bank2;

import it.unibo.oop.lab04.bank.BankAccount;

public abstract class AbstractBankAccount implements BankAccount {

    protected static final double ATM_TRANSACTION_FEE = 1;
    protected static final double MANAGEMENT_FEE = 5;
    protected static final double TRANSACTION_FEE = 0.1;

    protected final int usrID;
    protected double balance;
    protected int nTransactions;

    protected AbstractBankAccount(final int usrID, final double balance) {
        this.usrID = usrID;
        this.balance = balance;
        this.nTransactions = 0;
    }

    protected abstract boolean isWithdrawAllowed(final double amount);

    protected abstract void computeFee();

    protected void setBalance(final double balance) {
        this.balance = balance;
    }

    protected void setNTransactions(final int nTransactions) {
        this.nTransactions = nTransactions;
    }

    protected boolean checkUser(final int id) {
        return this.usrID == id;
    }
}
