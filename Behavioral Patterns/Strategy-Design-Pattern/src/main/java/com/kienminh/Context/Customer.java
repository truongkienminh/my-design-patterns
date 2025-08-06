package com.kienminh.Context;

import com.kienminh.Strategy.DiscountStrategy;

public class Customer {
    private String name;
    private DiscountStrategy discountStrategy;

    public Customer(String name, DiscountStrategy discountStrategy) {
        this.name = name;
        this.discountStrategy = discountStrategy;
    }

    public double getFinalAmount(double totalAmount) {
        return discountStrategy.applyDiscount(totalAmount);
    }

    public String getName() {
        return name;
    }
}
