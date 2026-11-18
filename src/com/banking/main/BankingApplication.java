package com.banking.main;

import java.util.Scanner;

import com.banking.exception.InsufficientBalanceException;
import com.banking.exception.InvalidAccountException;
import com.banking.exception.InvalidAmountException;
import com.banking.model.Account;
import com.banking.service.BankingService;

public class BankingApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BankingService service = new BankingService();

		// Creating sample accounts
		service.createAccount(new Account(1001, "Rahul", 10000));
		service.createAccount(new Account(1002, "Amit", 15000));

		int choice = 0;
		do {
			System.out.println("\n================================");
			System.out.println("   BANKING TRANSACTION SYSTEM");
			System.out.println("================================");
			System.out.println("1. Deposit Money");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Check Balance");
			System.out.println("4. Transaction History");
			System.out.println("5. Exit");
			System.out.println("================================");

			try {
				System.out.println("Enter Your Choice: ");
				choice = sc.nextInt();

				if (choice >= 1 && choice <= 4) {
					System.out.println("Enter Account Number: ");
					int accountNumber = sc.nextInt();

					switch (choice) {

					case 1:
						System.out.println("Enter Deposit Amount: ");
						double depositAmount = sc.nextDouble();

						service.deposit(accountNumber, depositAmount);
						break;

					case 2:

						System.out.println("Enter Withdrawal Amount: ");
						double withdrawalAmount = sc.nextDouble();

						service.withdraw(accountNumber, withdrawalAmount);
						break;

					case 3:

						service.checkBalance(accountNumber);
						break;

					case 4:

						service.transactionHistory(accountNumber);
						break;

					default:
						System.out.println("Invalid Choice!");
					}

				} else if (choice != 5) {
					System.out.println("Please enter a valid menu option.");
				}

			} catch (InsufficientBalanceException | InvalidAccountException | InvalidAmountException e) {
				System.out.println("Transaction Failed: " + e.getMessage());
			} catch (java.util.InputMismatchException e) {
				System.out.println("Invalid Input! Please enter numbers only.");

				sc.nextLine();
				choice = 0;

			} finally {
				System.out.println("Banking Operation Completed.");
			}

		} while (choice != 5);
		System.out.println("Thank You For Using Banking System!");
		sc.close();

	}

}
