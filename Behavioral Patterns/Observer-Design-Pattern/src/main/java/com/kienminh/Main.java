package com.kienminh;

import com.kienminh.ConcreteObserver.RegularCustomer;
import com.kienminh.ConcreteSubject.OnlineShop;
import com.kienminh.Observer.Customer;

public class Main {
    public static void main(String[] args) {
        OnlineShop shop = new OnlineShop();

        Customer alice = new RegularCustomer("Alice");
        Customer bob = new RegularCustomer("Bob");

        shop.registerCustomer(alice);
        shop.registerCustomer(bob);

        shop.discountProduct("iPhone 15 Pro Max", 24990000);
        System.out.println("---");

        shop.removeCustomer(bob);
        shop.discountProduct("MacBook Air M3", 28990000);
    }
}
