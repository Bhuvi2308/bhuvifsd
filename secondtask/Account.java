package secondtask;

public class Account {
	
	private int accountNumber;
	private double balance;
	
	
	//no argument constructor so the default values will be allocate
	Account()
	{
    accountNumber=0;
	balance=0.0;	
	}

	
	//two argument constructor so the initialize values will be pass here 
	Account(int accountNumber, double balance) {
		// TODO Auto-generated constructor stub
		this.accountNumber=accountNumber;
		this.balance=balance;
	}

	

	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Method to deposit a specified amount into the account
    public void deposit(double amount) {
        // Increase the balance by the specified amount
        balance = balance+ amount;
    }

    // Method to withdraw a specified amount from the account
    public void withdraw(double amount) {
        // Decrease the balance by the specified amount
        balance = balance- amount;
    }

    
    public void balance()
    {
    	System.out.println(balance);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = new Account(112233,10000);
		
		
		}

}
