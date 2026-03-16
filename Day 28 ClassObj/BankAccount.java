import java.util.Scanner;

class BankAccount {

    double balance = 1000; 

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Balance = " + balance);
    }
}