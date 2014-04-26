
public class SavingsAccount extends AbstractAccount {
	
	public double fBalance;
	private static double interestRate = 1.25;
	
	public SavingsAccount(Customer customer) {
		super(customer);
	}
	
	public void calculateInterest() {
		fBalance = fBalance + (fBalance * interestRate / 100);
	}
	
	public boolean withdrawal(double amount) {
		if(((fBalance - amount) < 0)) {
			return false;
		} else {
			fBalance = fBalance - amount;
			return true;
		}
	}
}
