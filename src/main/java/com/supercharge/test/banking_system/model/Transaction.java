package com.supercharge.test.banking_system.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Transaction {

    private double transferAmount;
    private Date dateOfTransaction;
    private double currentBalance;

    public Transaction() {
    }

}
