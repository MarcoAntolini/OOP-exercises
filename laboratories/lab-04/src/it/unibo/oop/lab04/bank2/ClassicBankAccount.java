package it.unibo.oop.lab04.bank2;

public class ClassicBankAccount extends AbstractBankAccount {

    public ClassicBankAccount(final int usrID, final double balance) {
        super(usrID, balance);
    }

    @Override
    public void computeManagementFees(int usrID) {
        if (this.checkUser(usrID) && (this.getNTransactions() > 0)) {
            this.computeFee();
        }
    }

    @Override
    public void deposit(int usrID, double amount) {
        if (this.checkUser(usrID)) {
            this.setBalance(this.getBalance() + amount);
            this.setNTransactions(this.getNTransactions() + 1);
        }
    }

    @Override
    public void depositFromATM(int usrID, double amount) {
        if (this.checkUser(usrID)) {
            this.setBalance(this.getBalance() + amount - ATM_TRANSACTION_FEE);
            this.setNTransactions(this.getNTransactions() + 1);
        }
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public int getNTransactions() {
        return this.nTransactions;
    }

    @Override
    public void withdraw(int usrID, double amount) {
        if (this.checkUser(usrID) && (this.isWithdrawAllowed(amount))) {
            this.setBalance(this.getBalance() - amount);
            this.setNTransactions(this.getNTransactions() + 1);
        }
    }

    @Override
    public void withdrawFromATM(int usrID, double amount) {
        if (this.checkUser(usrID) && (this.isWithdrawAllowed(amount))) {
            this.setBalance(this.getBalance() - amount - ATM_TRANSACTION_FEE);
            this.setNTransactions(this.getNTransactions() + 1);
        }
    }

    @Override
    protected boolean isWithdrawAllowed(final double amount) {
        return true;
    }

    @Override
    protected void computeFee() {
        this.setBalance(this.getBalance() - MANAGEMENT_FEE);
        this.setNTransactions(0);
    }
}
