package com.supercharge.test.banking_system.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Customer {

    private static int nextCustomerId = 1;
    private int customerId;
    private String customerFullName;
    private double balance;
    private List<Transaction> transactionHistory;

    public Customer() {
    }

    public Customer(String customerFullName, double balance) {
        this.customerId = nextCustomerId++;
        this.customerFullName = customerFullName;
        this.balance = balance;
        transactionHistory = new ArrayList<Transaction>();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerFullName='" + customerFullName + '\'' +
                ", balance=" + balance +
                ", transactionHistory=" + transactionHistory +
                '}';
    }
}
