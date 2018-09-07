package com.supercharge.test.banking_system.service;

import com.supercharge.test.banking_system.model.Customer;

public class TransferService {

    private TransactionService transactionService;

    public TransferService(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    public void transfer(Customer sender, Customer receiver, double transferAmount) {
        if (sender.getBalance() < transferAmount) {
            return;
        }

        if (transferAmount > 0) {
            sender.setBalance(sender.getBalance() - transferAmount);
            receiver.setBalance(receiver.getBalance() + transferAmount);
            transactionService.saveTransfer(sender, receiver, transferAmount);
        }
    }
}
