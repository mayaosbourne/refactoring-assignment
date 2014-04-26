/**
 * This class 
 * 
 * @author unknown
 * @author refactored by Maya Osbourne & Dawn Rocks
 * @version 4.25.2014
 *
 */
public class SavingsAccount extends AbstractAccount {
	
	/**
	 * {@inheritDoc}
	 */
	public double fBalance;
	
	/**
	 * The interest rate.
	 */
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
