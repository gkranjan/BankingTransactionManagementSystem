package com.banking.model;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private int accountNumber;
	private String holderName;
	private double balance;

	private List<String> transactions;

	public Account(int accountNumber, String holderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;

		transactions = new ArrayList<String>();

		transactions.add("Account created.Opening Balance: " + balance);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public List<String> getTransactions() {
		return transactions;
	}

}
