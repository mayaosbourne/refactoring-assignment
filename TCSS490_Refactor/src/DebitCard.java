/**
 * This class 
 * 
 * @author original author unknown
 * @author refactored by Maya Osbourne & Dawn Rocks
 * @version 4.25.2014
 *
 */
public class DebitCard {
	
	/**
	 * The account connected to.
	 */
	private CheckingAccount fAccountConnectedTo;
	
	/**
	 * The DebitCard constructor, accepts a limit and a checking
	 * account.
	 * 
	 * @param limit The debit limit.
	 * @param account The checking account.
	 */
	public DebitCard(double limit, CheckingAccount account) {
		fAccountConnectedTo = account;
	}
	
	/**
	 * The method for pay, accepts an amount in the parameter.
	 * 
	 * @param amount Pay by this amount.
	 * @return Success or failure?
	 */
	public boolean pay(double amount) {
		if((fAccountConnectedTo.getBalance() - amount) < -fAccountConnectedTo.getDebitAmount()) {
			fAccountConnectedTo.setBalance(fAccountConnectedTo.getBalance() - amount);
			return true;
		} else {
			return false;
		}
	}

}
