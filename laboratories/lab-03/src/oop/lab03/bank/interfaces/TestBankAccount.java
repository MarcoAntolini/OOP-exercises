package oop.lab03.bank.interfaces;

import oop.lab03.bank.AccountHolder;
import oop.lab03.bank.SimpleBankAccount;
import oop.lab03.bank.StrictBankAccount;

public final class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main(final String[] args) {
        AccountHolder mario = new AccountHolder("Mario", "Rossi", 1);
        AccountHolder luigi = new AccountHolder("Luigi", "Bianchi", 2);
        BankAccount marioAccount = new SimpleBankAccount(mario.getUserID(), 0);
        BankAccount luigiAccount = new StrictBankAccount(luigi.getUserID(), 0);
        marioAccount.deposit(mario.getUserID(), 10000);
        luigiAccount.deposit(luigi.getUserID(), 10000);
        marioAccount.withdraw(mario.getUserID(), 15000);
        luigiAccount.withdraw(luigi.getUserID(), 15000);
        System.out.println("Mario's account balance: " + marioAccount.getBalance());
        System.out.println("Luigi's account balance: " + luigiAccount.getBalance());
        marioAccount.deposit(mario.getUserID(), 10000);
        luigiAccount.deposit(luigi.getUserID(), 10000);
        marioAccount.chargeManagementFees(mario.getUserID());
        luigiAccount.chargeManagementFees(luigi.getUserID());
        System.out.println("Mario's account balance: " + marioAccount.getBalance());
        System.out.println("Luigi's account balance: " + luigiAccount.getBalance());
    }
}
