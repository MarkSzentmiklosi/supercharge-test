package com.supercharge.test.banking_system.service;

import com.supercharge.test.banking_system.model.Customer;

public class CustomerService {

    public void printTransactionHistory(Customer customer) {
        customer.getTransactionHistory()
                .stream()
                .forEach(System.out::println);
    }
}
