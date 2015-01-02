package com.thoughtworks.accountbalance;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account myAccount = new Account();
        int balance = 100;
        int newBalance = myAccount.deposit(50) + balance;
        assertThat(newBalance, is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account myAccount = new Account();
        int balance = 100;
        int newBalance = myAccount.withdraw(50) + balance;
        assertThat(newBalance, is(50));
    }
//
//    @Test
//    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
//
//    }
}
