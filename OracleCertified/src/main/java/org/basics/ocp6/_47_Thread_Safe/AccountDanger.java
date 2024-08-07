package org.basics.ocp6._47_Thread_Safe;

class Account{
    // instance değişkeni üzerinde write işlemi yapıldığında riskli durum söz konusudur.
    private int balance = 50;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount){
        balance = balance - amount;
    }
}

public class AccountDanger implements Runnable{

    private Account acct = new Account();

    public static void main(String[] args) {
        AccountDanger r = new AccountDanger();
        Thread one = new Thread(r);
        Thread two = new Thread(r);
        // Birden fazla thread (one,two), "aynı" nesne üzerinde (r değişkeni) üzerinde çalıştıklarında yazma/write
        // public void withdraw(int amount){///} yaptıklarında risk ortaya çıkar.
        // bu yapı thread-safe değildir.
        one.setName("Fred");
        two.setName("Lucy");
        one.start();
        two.start();
    }

    public void run(){
        for(int x=0; x<5; x++){
            makeWithdraval(10);
            if(acct.getBalance() < 0){
                System.out.println("account is overdrawn!");
            }
        }
    }

    // method synchronized olduğunda aynı anda sadece bir thread girebilir.
    // Bu durumda race condition problemini çözmüş oluruz.
    private synchronized void makeWithdraval(int amt){
        if(acct.getBalance() >= amt){
            System.out.println(Thread.currentThread().getName() + " is  going to withdraw!");
            try {
                Thread.sleep(500);
            }catch(InterruptedException ex){

            }
            acct.withdraw(amt);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
        }else{
            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + acct.getBalance());
        }
    }

}
