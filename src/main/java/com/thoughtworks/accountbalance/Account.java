package com.thoughtworks.accountbalance;

/**
 * Created by theodoraskolnik on 1/2/15.
 */
public class Account {
    private int balance;

    public int deposit(int i) {
        return balance += i;
    }

    public int withdraw(int i) {
        if (i > balance) {
            return balance;
        } else {
            return balance -= i;
        }
    }
}
