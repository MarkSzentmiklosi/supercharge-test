package com.supercharge.test.banking_system.service;

import com.supercharge.test.banking_system.model.Customer;
import com.supercharge.test.banking_system.model.Transaction;

import java.util.Date;
import java.util.List;

public class TransferService {

    public void transfer(Customer sender, Customer receiver, double transferAmount) {
        if (sender.getBalance() < transferAmount) {
            return;
        }

        if (transferAmount > 0) {
            sender.setBalance(sender.getBalance() - transferAmount);
            receiver.setBalance(receiver.getBalance() + transferAmount);
            saveTransaction(sender, receiver, transferAmount);
        }
    }

    private void saveTransaction(Customer sender, Customer receiver, double transferAmount) {
        Transaction transactionOfSender = getTransaction(sender.getBalance(), transferAmount);
        Transaction transactionOfReceiver = getTransaction(receiver.getBalance(), transferAmount);

        List<Transaction> transactionHistoryOfSender = sender.getTransactionHistory();
        transactionHistoryOfSender.add(transactionOfSender);
        sender.setTransactionHistory(transactionHistoryOfSender);

        List<Transaction> transactionHistoryOfReceiver = receiver.getTransactionHistory();
        transactionHistoryOfReceiver.add(transactionOfReceiver);
        sender.setTransactionHistory(transactionHistoryOfReceiver);
    }

    private Transaction getTransaction(double currentBalance, double transferAmount) {
        Transaction transaction = new Transaction();
        transaction.setCurrentBalance(currentBalance);
        transaction.setDateOfTransaction(new Date());
        transaction.setTransferAmount(transferAmount);

        return transaction;
    }
}
