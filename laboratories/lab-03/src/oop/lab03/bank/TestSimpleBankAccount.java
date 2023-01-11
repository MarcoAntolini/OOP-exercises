package oop.lab03.bank;

public final class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
    }

    public static void main(final String[] args) {
        AccountHolder mario = new AccountHolder("Mario", "Rossi", 1);
        AccountHolder luigi = new AccountHolder("Luigi", "Bianchi", 2);
        SimpleBankAccount marioAccount = new SimpleBankAccount(mario.getUserID(), 1000);
        SimpleBankAccount luigiAccount = new SimpleBankAccount(luigi.getUserID(), 1000);
        marioAccount.deposit(mario.getUserID(), 100);
        marioAccount.withdraw(mario.getUserID(), 50);
        luigiAccount.deposit(luigi.getUserID(), 100);
        luigiAccount.withdraw(luigi.getUserID(), 50);
        System.out.println("Mario's account balance: " + marioAccount.getBalance());
        System.out.println("Luigi's account balance: " + luigiAccount.getBalance());
        marioAccount.withdraw(2, 50);
        System.out.println("Mario's account balance: " + marioAccount.getBalance());
    }
}
