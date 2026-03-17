# Assignment 02: Encapsulation and Inheritance (Banking System)

## 🎯 Objectives
* **Encapsulation**: Practice protecting internal data states using access modifiers.
* **Inheritance**: Create a specialized class that builds upon the logic of a base class.
* **Logic Validation**: Implement business rules to ensure data integrity (e.g., preventing negative balances).

## 🏢 Scenario
You are developing a backend module for a digital banking application. The system needs to handle basic account operations like deposits and withdrawals. To ensure financial safety, the system must validate all transactions. You will also implement a specific type of account—a **Savings Account**—that calculates interest.

---

## 🛠️ Tasks

### 1. The `BankAccount` Class (Base Class)
This class represents a generic bank account.
* **Fields**:
    * `private String accountHolder`: The name of the account owner.
    * `protected double balance`: The current amount of money in the account.
* **Constructor**:
    * Initialize `accountHolder` and `balance`.
    * **Rule**: If the provided initial balance is negative, set the balance to `0.0`.
* **Methods**:
    * `public void deposit(double amount)`: Increases the balance **only if** the amount is positive.
    * `public void withdraw(double amount)`: Decreases the balance **only if** the amount is positive and the account has sufficient funds (no overdrafts).
    * `public double getBalance()`: Returns the current balance.

### 2. The `SavingsAccount` Class (Subclass)
This class extends `BankAccount` to include interest-bearing features.
* **Inheritance**: Must `extend BankAccount`.
* **Fields**:
    * `private double interestRate`: Represented as a decimal (e.g., `0.05` for 5%).
* **Constructor**:
    * Must use `super()` to initialize the holder and balance, then set the interest rate.
* **Methods**:
    * `public void applyInterest()`: Calculates interest ($Balance \times interestRate$) and adds that amount to the current balance.

---

## 📏 Constraints & Rules
1.  **Access Modifiers**: The `balance` field must be `protected` to allow subclasses to access it directly, but it must **never** be `public`.
2.  **Validation**: A withdrawal that exceeds the current balance must be ignored (the balance should remain unchanged).
3.  **Positive Input**: Neither `deposit` nor `withdraw` should accept negative numbers.

---

## 🚀 How to Submit
Your code is automatically graded using **JUnit 5** via GitHub Actions.

1.  **Local Testing**: Run `mvn test` in your terminal or use your IDE's built-in JUnit runner to check your logic before pushing.
2.  **Pushing to GitHub**:
    ```bash
    git add .
    git commit -m "Completed BankAccount and SavingsAccount logic"
    git push origin main
    ```
3.  **View Results**: Go to the **Actions** tab in this repository to see your autograder score.

---

## 📋 Evaluation Criteria
* **Encapsulation (25%)**: Correct use of `private` and `protected` modifiers.
* **Inheritance (25%)**: Proper use of `extends` and the `super` keyword.
* **Validation Logic (30%)**: Handling negative inputs and overdraft protection correctly.
* **Unit Tests (20%)**: Passing all automated test cases.
