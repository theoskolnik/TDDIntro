package com.thoughtworks.accountbalance;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class AccountTests {
    private Account myAccount;

    @Before
    public void setUp() throws Exception {
        myAccount = new Account();
    }

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        int balance = 100;
        int newBalance = myAccount.deposit(50) + balance;
        assertThat(newBalance, is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        myAccount.deposit(100);
        int newBalance = myAccount.withdraw(50);
        assertThat(newBalance, is(50));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        int balance = myAccount.deposit(50);
        int newBalance = myAccount.withdraw(100);
        assertThat(balance, is(newBalance));
    }
}
