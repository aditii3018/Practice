import java.util.*;

class BankAccount {
    double balance;
     public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully! Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void display(String name,int accountNo) {
            System.out.println("Name: " + name);
            System.out.println("Account No: " + accountNo);
        System.out.println("Current Balance: " + balance);
    }
}

public class Exp1H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the account number: ");
        int no = sc.nextInt();
        System.out.println("Enter the balance: ");
        double bal = sc.nextDouble();
        BankAccount a = new BankAccount();
        a.balance = bal;
        System.out.println("Enter the amount to deposit: ");
        double deposit = sc.nextDouble();
        a.deposit(deposit);
        System.out.println("Enter the amount to withdraw: ");
        double withdraw = sc.nextDouble();
        a.withdraw(withdraw);
        a.display(name,no);
    }
}
