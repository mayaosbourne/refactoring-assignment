/**
 * This is the savings account class, which defines
 * behaviors associated with a savings account.
 * 
 * @author original author unknown
 * @author refactored by Maya Osbourne & Dawn Rocks
 * @version 4.25.2014
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
	
	/**
	 * The savings account constructor.
	 * 
	 * @param customer The customer.
	 */
	public SavingsAccount(Customer customer) {
		super(customer);
	}
	
	/**
	 * Calculate the interest earned according to the
	 * balance in this account.
	 */
	public void calculateInterest() {
		fBalance = super.getBalance() + (super.getBalance() * interestRate / 100);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean withdrawal(double amount) {
		if(((fBalance - amount) < 0)) {
			return false;
		} else {
			fBalance = fBalance - amount;
			return true;
		}
	}
}
