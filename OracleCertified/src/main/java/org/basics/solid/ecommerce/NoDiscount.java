package org.basics.solid.ecommerce;

public class NoDiscount implements Discount {
    @Override
    public double apply(double price) {
        return price;
    }
}
