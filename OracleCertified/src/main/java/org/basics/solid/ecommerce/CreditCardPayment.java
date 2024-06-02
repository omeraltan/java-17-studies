package org.basics.solid.ecommerce;

public class CreditCardPayment extends PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }

}
