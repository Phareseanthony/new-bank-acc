import java.util.*;

public class BankAccount {
    String account_number;
    double balance;
    String date_of_opening;
    String customer_name;

    // Constructor
    BankAccount(String accNo, String name, String date, double bal) {
        account_number = accNo;
        customer_name = name;
        date_of_opening = date;
        balance = bal;
    }

    // i. Deposit method
    double deposit(double amount) {
        balance += amount;
        return amount;
    }

    // ii. Withdraw method
    String withdraw(double amount) {
        if (balance < amount) {
            return "Insufficient balance";
        } else {
            balance -= amount;
            return "Withdrawn: " + amount;
        }
    }

    // iii. Check balance
    void check_balance() {
        System.out.println("Current Balance: " + balance);
    }

    // iv. Customer details
    void customer_details() {
        System.out.println("Customer Name: " + customer_name);
        System.out.println("Account Number: " + account_number);
        System.out.println("Date of Opening: " + date_of_opening);
        System.out.println("Balance: " + balance);
    }

    // Main method for testing
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", "John Doe", "01-01-2024", 5000);

        acc.deposit(1000);
        System.out.println(acc.withdraw(2000));
        acc.check_balance();
        acc.customer_details();
    }
}