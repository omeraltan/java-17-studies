package org.basics.solid.ecommerce;

public class PayPalPayment extends PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }

}
