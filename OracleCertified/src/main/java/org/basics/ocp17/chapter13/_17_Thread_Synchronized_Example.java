package org.basics.ocp17.chapter13;

class BankAccount{

    private int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", Balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }

}

public class _17_Thread_Synchronized_Example {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                bankAccount.deposit(100);
            }
        }, "Thread 1");

        Thread t2 = new Thread(() -> {
           for (int i = 0; i < 5; i++) {
               bankAccount.deposit(200);
           }
        }, "Thread 2");

        t1.start();
        t2.start();

    }

}
