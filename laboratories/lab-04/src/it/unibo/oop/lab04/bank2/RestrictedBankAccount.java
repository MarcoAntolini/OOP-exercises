package it.unibo.oop.lab04.bank2;

public class RestrictedBankAccount extends AbstractBankAccount {

	protected RestrictedBankAccount(int usrID, double balance) {
		super(usrID, balance);
	}

	@Override
	public void computeManagementFees(int usrID) {
		if (checkUser(usrID)) {
			this.computeFee();
		}
	}

	@Override
	public void deposit(int usrID, double amount) {
		this.transactionOp(usrID, amount);
	}

	@Override
	public void depositFromATM(int usrID, double amount) {
		this.deposit(usrID, amount - ATM_TRANSACTION_FEE);
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public int getNTransactions() {
		return nTransactions;
	}

	@Override
	public void withdraw(int usrID, double amount) {
		if (isWithdrawAllowed(amount)) {
			this.transactionOp(usrID, -amount);
		}
	}

	@Override
	public void withdrawFromATM(int usrID, double amount) {
		this.withdraw(usrID, amount + ATM_TRANSACTION_FEE);
	}

	@Override
	protected boolean isWithdrawAllowed(double amount) {
		return balance > amount;
	}

	@Override
	protected void computeFee() {
		final double feeAmount = MANAGEMENT_FEE + (nTransactions * TRANSACTION_FEE);
		if (isWithdrawAllowed(feeAmount)) {
			balance -= feeAmount;
			nTransactions = 0;
		}
	}

	private void transactionOp(final int usrID, final double amount) {
		if (checkUser(usrID)) {
			this.balance += amount;
			this.nTransactions++;
		}
	}

}
