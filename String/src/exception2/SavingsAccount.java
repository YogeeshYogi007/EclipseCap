package exception2;
class InsufficientBalanceException extends Exception {
private double balance;
private double amount;


	public double getBalance() {
	return balance;
}


public void setBalance(double balance) {
	this.balance = balance;
}


public double getAmount() {
	return amount;
}


public void setAmount(double amount) {
	this.amount = amount;
}


	public InsufficientBalanceException(double balance) {
		if(amount>balance||balance==0) {
			System.out.println("InsufficientBalanceException");
		}
		else if(amount<=-0) {
			System.out.println("IllegalBalanceException");
		}
	}

	
}


public class SavingsAccount {
	public long id;
	public double balance;
	public double amount;
	
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	private void withdraw(double amount)throws InsufficientBalanceException{
	
		if(amount<=balance && amount>1)
		{
			balance-=amount;
			System.out.println("ThankYou for using our services Your Current SB Acc Balance is: "+balance);
			
		}
		else if(balance==0||amount>balance||amount<=-0) 
		{
			 throw new InsufficientBalanceException(balance);
		}
		
		
	}
	private double deposit(double amount) {
		return 0;
	}
	
	
	public static void main(String args[]) throws Exception {
		
		SavingsAccount s= new SavingsAccount();
		s.setBalance(7000);
		double d=s.getBalance();
		System.out.println(d);
		
		s.withdraw(500);
	}

}
