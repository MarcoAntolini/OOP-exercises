package oop.lab03.bank;

public class StrictBankAccount extends SimpleBankAccount {

    private static double MANAGEMENT_FEE = 5;
    private static double FEE_PER_TRANSACTION = 0.1;

    public StrictBankAccount(final int usrID, final double amount) {
        super(usrID, amount);
    }

    @Override
    public void withdraw(final int usrID, final double amount) {
        if (checkUser(usrID)) {
            if (getBalance() < amount) {
                System.out.println("Not enough money in the account");
                return;
            }
            incrementTransactions();
            decrementBalance(amount);
        }
    }

    @Override
    public void withdrawFromATM(final int usrID, final double amount) {
        if (checkUser(usrID)) {
            if (getBalance() < amount) {
                System.out.println("Not enough money in the account");
                return;
            }
            incrementTransactions();
            decrementBalance(amount + ATM_TRANSACTION_FEE);
        }
    }

    @Override
    public void chargeManagementFees(final int usrID) {
        if (checkUser(usrID)) {
            decrementBalance(MANAGEMENT_FEE + getTransactionsCount() * FEE_PER_TRANSACTION);
            resetTransactionsCount();
        }
    }
}