package com.kienminh.ConcreteStrategy;

import com.kienminh.Strategy.DiscountStrategy;

public class GoldDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.90;
    }
}