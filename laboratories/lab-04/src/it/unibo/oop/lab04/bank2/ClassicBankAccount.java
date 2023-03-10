package it.unibo.oop.lab04.bank2;

public class ClassicBankAccount extends AbstractBankAccount {

    public ClassicBankAccount(final int usrID, final double balance) {
        super(usrID, balance);
    }

    @Override
    public void computeManagementFees(int usrID) {
        if (this.getUsrID() == usrID) {
            if (this.getNTransactions() > 0) {
                this.computeFee();
            }
        }
    }

    @Override
    public void deposit(int usrID, double amount) {
        if (this.getUsrID() == usrID) {
            this.setBalance(this.getBalance() + amount);
            this.setNTransactions(this.getNTransactions() + 1);
        }
    }

    @Override
    public void depositFromATM(int usrID, double amount) {
        if (this.getUsrID() == usrID) {
            this.setBalance(this.getBalance() + amount - AbstractBankAccount.ATM_TRANSACTION_FEE);
            this.setNTransactions(this.getNTransactions() + 1);
        }
    }

    @Override
    public double getBalance() {
        return this.getBalance();
    }

    @Override
    public int getNTransactions() {
        return this.getNTransactions();
    }

    @Override
    public void withdraw(int usrID, double amount) {
        if (this.getUsrID() == usrID) {
            if (this.isWithdrawAllowed(amount)) {
                this.setBalance(this.getBalance() - amount - AbstractBankAccount.TRANSACTION_FEE);
                this.setNTransactions(this.getNTransactions() + 1);
            }
        }
    }

    @Override
    public void withdrawFromATM(int usrID, double amount) {
        if (this.getUsrID() == usrID) {
            if (this.isWithdrawAllowed(amount)) {
                this.setBalance(this.getBalance() - amount - AbstractBankAccount.ATM_TRANSACTION_FEE);
                this.setNTransactions(this.getNTransactions() + 1);
            }
        }
    }

    @Override
    protected boolean isWithdrawAllowed(final double amount) {
        return this.getBalance() >= amount;
    }

    @Override
    protected void computeFee() {
        this.setBalance(this.getBalance() - AbstractBankAccount.MANAGEMENT_FEE);
        this.setNTransactions(0);
    }
}
