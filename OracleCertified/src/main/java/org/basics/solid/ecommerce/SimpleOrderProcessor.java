package org.basics.solid.ecommerce;

public class SimpleOrderProcessor implements OrderProcessor {

    @Override
    public void processOrder(Order order) {
        System.out.println("Order processed with " + order.getProducts().size() + " products.");
    }

}
