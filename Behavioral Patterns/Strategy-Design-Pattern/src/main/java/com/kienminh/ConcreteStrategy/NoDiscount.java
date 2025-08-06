package com.kienminh.ConcreteStrategy;

import com.kienminh.Strategy.DiscountStrategy;

public class NoDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount;
    }
}
