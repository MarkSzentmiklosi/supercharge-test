package com.supercharge.test.banking_system.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {

    private static int nextCustomerId = 1;
    private int customerId;
    private String customerFullName;
    private double balance;

    public Customer() {
    }

    public Customer(String customerFullName, double balance) {
        this.customerId = nextCustomerId++;
        this.customerFullName = customerFullName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerFullName='" + customerFullName + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            balance += depositAmount;
        }
    }
}
