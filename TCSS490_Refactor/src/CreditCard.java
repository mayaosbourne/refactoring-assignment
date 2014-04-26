/**
 * This credit card class, defines the behavior associated
 * with a credit card. 
 * 
 * @author original author unknown
 * @author refactored by Maya Osbourne & Dawn Rocks
 * @version 4.25.2014
 *
 */
public class CreditCard {
	
	/**
	 * The credit limit.
	 * You cannot spend more than this limit.
	 */
	private double fLimit;
	
	/**
	 * The credit balance.
	 */
	private double fBalance;
	
	/**
	 * The credit card constructor, creates a new credit card
	 * with a limit of $2,500 and balance of $0.
	 */
	public CreditCard() {
		fLimit = 2500; // standard limit
		fBalance = 0;
	}
	
	/**
	 * The credit card constructor, creates a new credit card
	 * with the specified limit.
	 * 
	 * @param limit The credit limit.
	 */
	public CreditCard(double limit) {
		fLimit = limit;
		fBalance = 0;
	}
	
	/**
	 * The method for pay, accepts an amount in the parameter.
	 * 
	 * @param amount Pay by this amount.
	 * @return Success or failure?
	 */
	public boolean pay(double amount) {
		if((fBalance - amount) < -fLimit) {
			fBalance -= amount;
			return true;
		} else {
			return false;
		}
	}
}
