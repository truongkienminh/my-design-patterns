package com.kienminh.ConcreteSubject;

import com.kienminh.Observer.Customer;
import com.kienminh.Subject.Shop;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop implements Shop {
    private List<Customer> customers = new ArrayList<>();

    @Override
    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    @Override
    public void notifyCustomers(String productName, double newPrice) {
        for (Customer customer : customers) {
            customer.update(productName, newPrice);
        }
    }

    public void discountProduct(String productName, double newPrice) {
        System.out.println("⚡️ Shop thông báo: " + productName + " giảm còn " + newPrice + " VND!");
        notifyCustomers(productName, newPrice);
    }
}
