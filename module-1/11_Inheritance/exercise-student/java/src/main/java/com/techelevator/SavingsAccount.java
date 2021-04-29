package com.techelevator;

import java.lang.invoke.LambdaMetafactory;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }
    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }
    @Override
    public int withdraw(int amountToWithdraw) {
        if (amountToWithdraw > getBalance()) {
            return getBalance();
        } else if (getBalance() - amountToWithdraw > 150) {
            super.withdraw(amountToWithdraw);
        }
    else if (getBalance() - amountToWithdraw < 150) {
        super.withdraw(amountToWithdraw + 2);
        }
    return getBalance();
    }
}
