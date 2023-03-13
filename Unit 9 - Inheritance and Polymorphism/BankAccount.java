
public class BankAccount {

	private double balance;
	
	public BankAccount() {
		
		this.balance = 0.00;
		
	}
	
	public double deposit(double d) {
		
		balance += d;
		
		return balance;
		
	}
	
	public double withdraw(double w ) {
		
		balance -= w;
		
		return balance;
		
	}
	
}
