package it.unibo.oop.lab04.bank2;

import it.unibo.oop.lab04.bank.BankAccount;

public abstract class AbstractBankAccount implements BankAccount {

    private static final double ATM_TRANSACTION_FEE = 1;
    private static final double MANAGEMENT_FEE = 5;
    private static final double TRANSACTION_FEE = 0.1;

    private final int usrID;
    private double balance;
    private int nTransactions;

    protected AbstractBankAccount(final int usrID, final double balance) {
        this.usrID = usrID;
        this.balance = balance;
        this.nTransactions = 0;
    }

    public abstract void computeManagementFees(int usrID);

    public abstract void deposit(int usrID, double amount);

    public abstract void depositFromATM(int usrID, double amount);

    public abstract double getBalance();

    public abstract int getNTransactions();

    public abstract void withdraw(int usrID, double amount);

    public abstract void withdrawFromATM(int usrID, double amount);

    protected abstract boolean isWithdrawAllowed(final double amount);

    protected abstract void computeFee();

    protected boolean checkUser(final int id) {
        return this.usrID == id;
    }
}
