package org.basics.solid.ecommerce;

import java.util.ArrayList;
import java.util.List;

/**
 *      Single Responsibility Principle
 */
public class Order {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}
