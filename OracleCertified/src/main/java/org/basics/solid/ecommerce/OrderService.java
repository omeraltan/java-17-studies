package org.basics.solid.ecommerce;

public class OrderService {

    private OrderProcessor orderProcessor;
    private Discount discount;
    private PaymentMethod paymentMethod;

    public OrderService(OrderProcessor orderProcessor, Discount discount, PaymentMethod paymentMethod) {
        this.orderProcessor = orderProcessor;
        this.discount = discount;
        this.paymentMethod = paymentMethod;
    }

    public void processOrder(Order order) {
        double total = 0;
        for (Product product : order.getProducts()) {
            total += product.getPrice();
        }
        total = discount.apply(total);
        orderProcessor.processOrder(order);
        paymentMethod.pay(total);
    }

}
