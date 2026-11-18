package com.banking.service;

import java.util.ArrayList;
import java.util.List;

import com.banking.exception.InsufficientBalanceException;
import com.banking.exception.InvalidAccountException;
import com.banking.exception.InvalidAmountException;
import com.banking.model.Account;

public class BankingService {

	private List<Account> accounts = new ArrayList<Account>();

	// Create Account
	public void createAccount(Account account) {
		accounts.add(account);
		//System.out.println("Account Created Successfully!");
	}

	// Find Account
	private Account findAccount(int accountNumber) throws InvalidAccountException {
		for (Account account : accounts) {
			if (account.getAccountNumber() == accountNumber) {
				return account;
			}
		}
		throw new InvalidAccountException("Account Not Found: " + accountNumber);

	}

	// Deposit Money
	public void deposit(int accountNumber, double amount) throws InvalidAmountException, InvalidAccountException {
		Account account = findAccount(accountNumber);

		if (amount <= 0) {
			throw new InvalidAmountException("Deposit amount must be grater thaan zero.");
		}
		account.setBalance(account.getBalance() + amount);

		account.getTransactions().add("Deposited: " + amount);

		System.out.println("Money Deposited Successfully!");
		System.out.println("Available Balance: " + account.getBalance());
	}

	// Withdraw Money
	public void withdraw(int accountNumber, double amount)
			throws InvalidAccountException, InvalidAmountException, InsufficientBalanceException {
		Account account = findAccount(accountNumber);

		if (amount <= 0) {
			throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
		}

		if (amount > account.getBalance()) {
			throw new InsufficientBalanceException("Insufficient Balance! Available Balance: " + account.getBalance());

		}
		account.setBalance(account.getBalance() - amount);

		account.getTransactions().add("Withdrawn: " + amount);

		System.out.println("Withdrawal Successful!");
		System.out.println("Remaining Balance: " + account.getBalance());
	}

	// Check Balance
	public void checkBalance(int accountNumber) throws InvalidAccountException {
		Account account = findAccount(accountNumber);

		System.out.println("Accountholder: " + account.getHolderName());
		System.out.println("Current Balance: " + account.getBalance());
	}

	// Transaction History
	public void transactionHistory(int accountNumber) throws InvalidAccountException {
		Account account = findAccount(accountNumber);
		System.out.println("Transaction History:");

		for (String transaction : account.getTransactions()) {
			System.out.println(transaction);
		}
	}

}
