package com.kienminh.ConcreteStrategy;

import com.kienminh.Strategy.DiscountStrategy;

public class PlatinumDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.80;
    }
}