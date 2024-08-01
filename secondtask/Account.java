package secondtask;
import java.util.Scanner;

public class Account {
private double balance;
	     
	    public Account() {
	        this.balance = 0.0;
	       
	    }

	   
	    public Account(double initialBalance) {
	        if (initialBalance >= 0) {
	            this.balance = initialBalance; 
	        } 
	    }

	    
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        }  
	    }

	    
	    public void withdraw(double amount) {
	        if (amount > 0) {
	            if (amount <= balance) {
	                balance -= amount;
	                System.out.println("Withdrew: " + amount);
	            } else {
	                System.out.println("Insufficient balance.");
	            }
	        } 
	    }

	    
	    public void displayBalance() {
	        System.out.println("Current balance: " + balance);
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter initial balance: ");
	        double initialBalance = scanner.nextDouble();
	        Account account = new Account(initialBalance);

	        while (true) {
	            System.out.println("\nAccount Management System");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Display Balance");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter amount to deposit: $");
	                    double depositAmount = scanner.nextDouble();
	                    account.deposit(depositAmount);
	                    break;

	                case 2:
	                    System.out.print("Enter amount to withdraw: $");
	                    double withdrawAmount = scanner.nextDouble();
	                    account.withdraw(withdrawAmount);
	                    break;

	                case 3:
	                    account.displayBalance();
	                    break;

	                case 4:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}
	