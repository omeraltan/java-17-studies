package org.basics.solid.ecommerce;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1500);
        Product product2 = new Product("Mouse", 50);

        Order order = new Order();
        order.addProduct(product1);
        order.addProduct(product2);

        OrderProcessor orderProcessor = new SimpleOrderProcessor();
        Discount discount = new PercentageDiscount(10);
        PaymentMethod paymentMethod = new CreditCardPayment();

        OrderService orderService = new OrderService(orderProcessor, discount, paymentMethod);
        orderService.processOrder(order);
    }
}
