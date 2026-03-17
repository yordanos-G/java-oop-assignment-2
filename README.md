# Assignment 02: Encapsulation and Inheritance (Banking System)

## 🎯 Objectives
* **Encapsulation**: Practice protecting internal data states using access modifiers.
* **Inheritance**: Create multiple specialized classes that share a common foundation.
* **Method Overriding**: Learn how to modify parent behavior in a subclass.

## 🏢 Scenario
You are developing a backend for a bank. While all accounts have a balance and a holder name, different types of accounts have different rules. You will implement a base account and two specific variations: one for saving money and one for frequent daily transactions.

---

## 🛠️ Tasks

### 1. The `BankAccount` Class (Base Class)
This class handles logic common to **all** accounts.
* **Fields**:
    * `private String accountHolder`
    * `protected double balance`
* **Constructor**: Initialize both fields. If `initialBalance` < 0, set it to `0.0`.
* **Methods**: 
    * `deposit(double amount)`: Increase balance if amount is positive.
    * `withdraw(double amount)`: Decrease balance if amount is positive and funds are sufficient.

### 2. The `SavingsAccount` Class (The "Adder")
A specialized account that grows over time.
* **Inheritance**: Extends `BankAccount`.
* **Additional Field**: `private double interestRate` (e.g., 0.05).
* **New Method**: `applyInterest()`: Adds ($balance \times interestRate$) to the current balance.

### 3. The `CheckingAccount` Class (The "Modifier")
A daily-use account that charges a fee for every withdrawal.
* **Inheritance**: Extends `BankAccount`.
* **Additional Field**: `private static final double TRANSACTION_FEE = 1.50;`
* **Method Overriding**: Override `withdraw(double amount)`. 
    * **Logic**: The total deduction should be `amount + TRANSACTION_FEE`. 
    * **Rule**: Only perform the withdrawal if the balance can cover **both** the amount and the fee.

---

## 📏 Constraints & Rules
1.  **Access Modifiers**: `balance` must be `protected`. All other fields must be `private`.
2.  **Code Reuse**: In `CheckingAccount`, try to use `super.withdraw()` rather than rewriting the balance subtraction logic manually.
3.  **Validation**: No account should ever have a negative balance.

---

## 🚀 How to Submit
1.  **Local Testing**: Run `mvn test` to ensure your logic passes the provided test suite.
2.  **Pushing to GitHub**:
    ```bash
    git add .
    git commit -m "Implemented Bank, Savings, and Checking accounts"
    git push origin main
    ```
3.  **View Results**: Check the **Actions** tab on GitHub for your final score.

---

## 📋 Evaluation Criteria
* **Encapsulation (20%)**: Correct use of `private` and `protected`.
* **Savings Logic (25%)**: Correct interest calculation and initialization.
* **Checking Logic (35%)**: Successful overriding of the withdrawal method to include fees.
* **Code Cleanliness (20%)**: Proper use of `super` and adherence to naming conventions.
