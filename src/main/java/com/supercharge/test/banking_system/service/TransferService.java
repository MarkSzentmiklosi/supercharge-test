package com.supercharge.test.banking_system.service;

import com.supercharge.test.banking_system.model.Customer;

public class TransferService {

    public void transfer(Customer sender, Customer receiver, double transferAmount) {
        if (sender.getBalance() < transferAmount) {
            return;
        }

        if (transferAmount > 0) {
            sender.setBalance(sender.getBalance() - transferAmount);
            receiver.setBalance(receiver.getBalance() + transferAmount);
        }
    }
}
