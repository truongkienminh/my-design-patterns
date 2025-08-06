package com.kienminh.Subject;

import com.kienminh.Observer.Customer;

public interface Shop {
    void registerCustomer(Customer customer);
    void removeCustomer(Customer customer);
    void notifyCustomers(String productName, double newPrice);
}
