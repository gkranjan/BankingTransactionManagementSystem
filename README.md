# 🏦 Banking Transaction Management System

## 📌 Project Overview

The **Banking Transaction Management System** is a Java-based console application designed to simulate real-world banking operations using Object-Oriented Programming (OOP) principles and industry-oriented Exception Handling.

This project demonstrates how banking applications manage customer accounts, process financial transactions, validate business rules, and handle unexpected situations using custom exceptions.

The application provides essential banking functionalities such as account management, money deposits, withdrawals, balance inquiries, and transaction history tracking.

A major focus of this project is implementing **custom exception handling** to ensure that invalid transactions, insufficient balances, invalid account numbers, and incorrect input values are handled safely and systematically.

## 🎯 Project Objectives

- Implement real-world business logic using Core Java.
- Understand practical exception handling in enterprise applications.
- Create custom exceptions for business-specific errors.
- Maintain multiple bank accounts using Java Collections.
- Apply encapsulation and separation of responsibilities.
- Validate financial transactions before updating account balances.
- Maintain transaction history for every account.

## 🚀 Key Features

### 1. Account Management
- Create and maintain multiple bank accounts.
- Store account number, account holder name, and account balance.
- Manage account information using `ArrayList`.

### 2. Deposit Management
- Deposit money into an existing bank account.
- Validate deposit amounts.
- Prevent negative and zero-value deposits.
- Update account balance after successful transactions.

### 3. Withdrawal Management
- Withdraw money from an existing account.
- Check available balance before processing withdrawals.
- Prevent withdrawals exceeding the available balance.
- Update account balance after successful transactions.

### 4. Balance Inquiry
- Retrieve account details.
- Display account holder information.
- Check the current available balance.

### 5. Transaction History
- Maintain transaction records for each account.
- Track account creation, deposits, and withdrawals.
- Display transaction history whenever requested.

## 🛡️ Exception Handling Implementation

This project implements multiple exception-handling techniques to manage real-world banking errors.

| Exception | Purpose |
|---|---|
| `InsufficientBalanceException` | Handles withdrawals exceeding the available balance. |
| `InvalidAccountException` | Handles operations on accounts that do not exist. |
| `InvalidAmountException` | Prevents negative or zero transaction amounts. |
| `InputMismatchException` | Handles invalid user input types. |

### Exception Handling Concepts Used

- **try-catch:** Handles exceptions during banking operations.
- **finally:** Executes cleanup or completion logic.
- **throw:** Explicitly throws custom exceptions when business rules are violated.
- **throws:** Declares exceptions that may occur during method execution.
- **Custom Exceptions:** Creates application-specific exception classes.
- **Multiple Catch:** Handles different exception types separately.

## 🏗️ Project Architecture

The project follows a layered package structure to maintain clean and organized code.

```text
BankingTransactionSystem
│
└── src
    └── com.banking
        │
        ├── main
        │   └── BankingApplication.java
        │
        ├── model
        │   └── Account.java
        │
        ├── service
        │   └── BankingService.java
        │
        └── exception
            ├── InsufficientBalanceException.java
            ├── InvalidAccountException.java
            └── InvalidAmountException.java
```

### Package Responsibilities

| Package | Responsibility |
|---|---|
| `main` | Application entry point and user interaction. |
| `model` | Represents bank account data. |
| `service` | Implements banking business logic. |
| `exception` | Contains custom exception classes. |

## 🔄 Application Workflow

1. Start the banking application.
2. Initialize the banking service.
3. Create sample bank accounts.
4. Display the banking menu.
5. Accept the user's operation.
6. Identify the requested account.
7. Validate the transaction.
8. Execute the operation if validation succeeds.
9. Throw and handle exceptions if validation fails.
10. Display the result and return to the main menu.

## 💻 Technologies Used

- **Programming Language:** Java
- **Java Version:** Java 8
- **IDE:** Eclipse IDE
- **Concepts:** Core Java, OOP, Exception Handling
- **Collections Framework:** ArrayList
- **Development Approach:** Modular Programming

## 📚 Core Java Concepts Covered

- Classes and Objects
- Encapsulation
- Constructors
- Getters and Setters
- Methods and Method Parameters
- ArrayList
- Enhanced For Loop
- Custom Exception Handling
- Checked Exceptions
- try-catch-finally
- throw and throws
- Input Validation
- Package Management
- Separation of Responsibilities

## 🧪 Testing Scenarios

| Test Scenario | Expected Result |
|---|---|
| Valid deposit | Deposit successful |
| Valid withdrawal | Withdrawal successful |
| Withdrawal exceeding balance | Insufficient balance exception |
| Invalid account number | Invalid account exception |
| Negative deposit | Invalid amount exception |
| Negative withdrawal | Invalid amount exception |
| Invalid menu input | Input mismatch handled |
| Transaction history request | Display transaction records |

## ▶️ How to Run the Project

1. Clone this repository:

```bash
git clone https://github.com/gkranjan/BankingTransactionSystem.git
```

2. Open Eclipse IDE.
3. Import the project into your workspace.
4. Verify the Java 8 configuration.
5. Open `BankingApplication.java`.
6. Run the application as a Java Application.
7. Use the console menu to perform banking operations.

## 🔮 Future Enhancements

- Integrate MySQL database using JDBC.
- Implement customer registration and login.
- Add fund transfers between accounts.
- Generate unique transaction IDs.
- Implement transaction rollback.
- Add account statements and transaction reports.
- Introduce multithreading and transaction concurrency control.
- Integrate Spring Boot REST APIs.
- Implement authentication and authorization.

## 👨‍💻 Developer

**Gautam Kumar Ranjan**

Java Backend Developer

GitHub: [@gkranjan](https://github.com/gkranjan)

---

⭐ If you find this project useful, consider giving the repository a star!

**Note:** This project is developed for Java learning and practical software development experience. It uses in-memory storage and is not intended for real financial transactions.
