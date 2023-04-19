package it.unibo.oop.lab04.bank;

public class ExtendedStrictBankAccount extends SimpleBankAccount {

    private static final double TRANSACTION_FEE = 0.1;

    private final int usrID;

    public ExtendedStrictBankAccount(final int usrID, final double balance) {
        super(usrID, balance);
        this.usrID = usrID;
    }

    @Override
    public void computeManagementFees(final int usrID) {
        final double feeAmount = MANAGEMENT_FEE + (getNTransactions() * TRANSACTION_FEE);
        if (checkUser(usrID) && isWithdrawAllowed(feeAmount)) {
            setBalance(getBalance() - feeAmount);
            resetTransactions();
        }
    }

    private boolean isWithdrawAllowed(final double amount) {
        return getBalance() >= amount;
    }

    @Override
    public void withdraw(final int usrID, final double amount) {
        if (isWithdrawAllowed(amount)) {
            transactionOp(usrID, -amount);
        }
    }

    private void transactionOp(final int usrID, final double amount) {
        if (checkUser(usrID)) {
            setBalance(getBalance() + amount);
            incTransactions();
        }
    }

    public int getUserID() {
        return usrID;
    }
}
