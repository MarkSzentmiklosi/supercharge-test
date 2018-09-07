package com.supercharge.test.banking_system.service;

import com.supercharge.test.banking_system.model.Customer;

public class DepositService {

    public void deposit(Customer customer, double depositAmount) {
        customer.deposit(depositAmount);
    }
}
