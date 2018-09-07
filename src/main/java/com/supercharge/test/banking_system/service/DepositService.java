package com.supercharge.test.banking_system.service;

import com.supercharge.test.banking_system.model.Customer;

public class DepositService {

    private TransactionService transactionService;

    public DepositService(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    public void deposit(Customer customer, double depositAmount) {
        if (depositAmount > 0) {
            customer.setBalance(customer.getBalance() + depositAmount);
            transactionService.saveDeposit(customer, depositAmount);
        }
    }
}
