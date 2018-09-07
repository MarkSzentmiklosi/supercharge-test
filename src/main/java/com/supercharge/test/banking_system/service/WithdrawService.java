package com.supercharge.test.banking_system.service;

import com.supercharge.test.banking_system.model.Customer;

public class WithdrawService {

    private TransactionService transactionService;

    public WithdrawService(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    public void withdraw(Customer customer, double withdrawAmount) {
        double balanceOfCustomer = customer.getBalance();

        if (withdrawAmount > 0 && balanceOfCustomer >= withdrawAmount) {
            customer.setBalance(balanceOfCustomer - withdrawAmount);
            transactionService.saveWithdrawal(customer, withdrawAmount);
        }
    }
}
