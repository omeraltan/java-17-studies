package org.basics.ocp17.chapter13;

class BankAccount2 {
    private int balance = 0;

    public void deposit(int amount) {
        // Synchronized block
        synchronized (this) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", Balance: " + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}


public class _18_Thread_Synchronized_Block_Example {
    public static void main(String[] args) {
        BankAccount2 account = new BankAccount2();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(100);
            }
        }, "Thread 1");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(200);
            }
        }, "Thread 2");

        t1.start();
        t2.start();
    }
}
