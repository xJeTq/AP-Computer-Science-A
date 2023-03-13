
public class SavingsAccount extends BankAccount {
	
	private double interestRate;
	
	public SavingsAccount(int i) {
		
		this.interestRate = i;
		
	}
	
	public double addInterestRate(double balance) {
		
		balance += (balance) * (interestRate / 100);
		
		return balance;
		
	}

}
