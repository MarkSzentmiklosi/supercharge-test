package com.supercharge.test.banking_system.service;

import com.supercharge.test.banking_system.model.Customer;

public class WithdrawService {

    public void withdraw(Customer customer, double withdrawAmount) {
        double balanceOfCustomer = customer.getBalance();
        if (withdrawAmount > 0 && balanceOfCustomer >= withdrawAmount) {
            customer.setBalance(balanceOfCustomer - withdrawAmount);
        }
    }
}
