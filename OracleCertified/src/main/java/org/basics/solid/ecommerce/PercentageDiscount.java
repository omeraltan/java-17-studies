package org.basics.solid.ecommerce;

public class PercentageDiscount implements Discount {

    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double apply(double price) {
        return price - (price * percentage / 100);
    }
}
