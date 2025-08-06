package com.kienminh;

import com.kienminh.ConcreteStrategy.GoldDiscount;
import com.kienminh.ConcreteStrategy.NoDiscount;
import com.kienminh.ConcreteStrategy.PlatinumDiscount;
import com.kienminh.ConcreteStrategy.SilverDiscount;
import com.kienminh.Context.Customer;

public class Main {
    public static void main(String[] args) {
        Customer regular = new Customer("Alice", new NoDiscount());
        Customer silver = new Customer("Bob", new SilverDiscount());
        Customer gold = new Customer("Charlie", new GoldDiscount());
        Customer platinum = new Customer("Diana", new PlatinumDiscount());

        double amount = 1000;

        System.out.println(regular.getName() + " pays: " + regular.getFinalAmount(amount));
        System.out.println(silver.getName() + " pays: " + silver.getFinalAmount(amount));
        System.out.println(gold.getName() + " pays: " + gold.getFinalAmount(amount));
        System.out.println(platinum.getName() + " pays: " + platinum.getFinalAmount(amount));
    }
}