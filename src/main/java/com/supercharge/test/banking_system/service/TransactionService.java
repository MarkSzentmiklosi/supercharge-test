package com.supercharge.test.banking_system.service;

import com.supercharge.test.banking_system.model.Customer;
import com.supercharge.test.banking_system.model.Transaction;
import com.supercharge.test.banking_system.model.TransactionType;

import java.util.Date;
import java.util.List;

public class TransactionService {

    public void saveTransfer(Customer sender, Customer receiver, double transferAmount) {
        Transaction transactionOfSender = getTransaction(sender.getBalance(), transferAmount, TransactionType.TRANSFER);
        Transaction transactionOfReceiver = getTransaction(receiver.getBalance(), transferAmount, TransactionType.TRANSFER);

        modifyTransactionHistory(sender, transactionOfSender);
        modifyTransactionHistory(receiver, transactionOfReceiver);
    }

    private Transaction getTransaction(double currentBalance, double transactionAmount, TransactionType transactionType) {
        Transaction transaction = new Transaction();
        transaction.setCurrentBalance(currentBalance);
        transaction.setDateOfTransaction(new Date());
        transaction.setTransferAmount(transactionAmount);
        transaction.setTypeOfTransaction(transactionType);

        return transaction;
    }

    private void modifyTransactionHistory(Customer customer, Transaction transaction) {
        List<Transaction> transactionHistory = customer.getTransactionHistory();
        transactionHistory.add(transaction);
        customer.setTransactionHistory(transactionHistory);
    }
}
