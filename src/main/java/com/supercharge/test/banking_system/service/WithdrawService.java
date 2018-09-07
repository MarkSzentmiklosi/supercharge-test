package com.supercharge.test.banking_system.service;

import com.supercharge.test.banking_system.model.Customer;

public class WithdrawService {

    public void withdraw(Customer customer, double withdrawAmount) {
        if (withdrawAmount > 0) {
            customer.setBalance(customer.getBalance() - withdrawAmount);
        }
    }
}
