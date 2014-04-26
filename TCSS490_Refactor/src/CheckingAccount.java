/**
 * This class defines the behavior of a Checking Account.
 * 
 * It allows the user to create a new checking account,
 * determine costs, withdraw, and other checking account
 * behaviors.
 * 
 * @author unknown
 * @author refactored by Maya Osbourne & Dawn Rocks
 * @version 4.25.2014
 */
public class CheckingAccount extends AbstractAccount {
	
	/**
	 * {@inheritDoc}
	 */
	private double fBalance;
	
	/**
	 * Is debit allowed? variable.
	 */
	private boolean fDebitAllowed;
	
	/**
	 * The debit amount.
	 */
	private double fDebitAmount;
	
	/**
	 * The costs.
	 * 
	 * Per period there is a cost associated with this account
	 * that equals 1 pound.
	 */
	private static double costs = 1;
	
	/**
	 * The debit rate.
	 */
	private static double debitRate = 4.7;
	
	/**
	 * The checking account constructor, accepts a customer as a
	 * parameter. Sets the account number to the next account number,
	 * increments the next account number by one, sets debit allowed to
	 * false, and the debit amount to zero upon creation.
	 * 
	 * @param customer The customer.
	 */
	public CheckingAccount(Customer customer) {
		super(customer);
		fDebitAllowed = false;
		fDebitAmount = 0;
	}
	
	/**
	 * The checking account constructor, accepts a customer and a debit 
	 * amount as a parameter. Sets the account number to the next account 
	 * number, increments the next account number by one, sets debit allowed
	 * to true, and the debit amount to zero upon creation.
	 * 
	 * @param customer The customer.
	 * @param debit The debit.
	 */
	public CheckingAccount(Customer customer, float debit) {
		super(customer);
		fDebitAllowed = true;
		fDebitAmount = debit;
	}
	
	/**
	 * Determine the monthly fee for the account.
	 */
	public void determineCosts() {
		fBalance = fBalance - costs;
		if(fBalance < 0) {
			fBalance = fBalance - (fBalance * debitRate / 100);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean withdrawal(double amount) {
		if(((fBalance - amount) < 0) && (!fDebitAllowed)) {
			return false;
		} else if((fBalance - amount) < -fDebitAmount) {
			fBalance = fBalance - amount;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Get the debit amount.
	 * 
	 * @return The debit amount.
	 */
	public double getDebitAmount() {
		return fDebitAmount;
	}

	/**
	 * Set fBalance to the amount.
	 * @param amount The amount.
	 */
	public void setBalance(double amount) {
		fBalance = amount;	
	}
	
}
