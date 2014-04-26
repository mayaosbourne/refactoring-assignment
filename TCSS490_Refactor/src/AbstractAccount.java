/**
 * AbstractAccount is an abstract class, which creates
 * general behavior for an account type class (Savings or Checking
 * for example).
 * 
 * @author original author unknown
 * @author refactored by Maya Osbourne & Dawn Rocks
 * @version 4.25.2014
 */
public abstract class AbstractAccount {

	/**
	 * The account number.
	 */
	private int fAccountNumber;
	
	/**
	 * The account balance.
	 */
	private double fBalance;
	
	/**
	 * The customer associated with this account.
	 */
	private Customer myCustomer;
	
	/**
	 * The next account number.
	 */
	private static int fNextAccountNumber = 0;
	
	/**
	 * Default constructor.
	 */
	public AbstractAccount() {
		
	}
	
	/**
	 * Constructor that accepts a customer as a parameter.
	 * 
	 * @param customer The customer.
	 */
	public AbstractAccount(Customer customer) {
		myCustomer = customer;
		fAccountNumber = fNextAccountNumber;
		fNextAccountNumber++;
	}

	/**
	 * Increase the balance for this account by the amount given.
	 * 
	 * @param amount The amount.
	 */
	public void increaseBalance(double amount) {
		fBalance += amount;
	}
	
	/**
	 * Decrease the balance for this account by the amount given.
	 * 
	 * @param amount The amount.
	 */
	public void decreaseBalance(double amount) {
		fBalance -= amount;
	}
	
	/**
	 * Get the balance for this account.
	 * 
	 * @return the balance.
	 */
	public double getBalance() {
		return fBalance;
	}

	/**
	 * Get the account number for this account.
	 * @return
	 */
	public int getAccountNumber() {
		return fAccountNumber;	
	}
	
	/**
	 * The print method for this account, which prints out the information
	 * associated for this accounts (Account number, account holder name,
	 * address of account holder, and the balance remaining in this account.).
	 */
	public void print() {
		System.out.println("**************************************");
		System.out.println("Savings account:     " + fAccountNumber);
		System.out.println("Account holder name: " + myCustomer.getfName());
		System.out.println("Address:             " + myCustomer.getfStreet());
		System.out.print("                     " + myCustomer.getfZipcode());
		System.out.println(" " + myCustomer.getfTown());
		System.out.println(myCustomer.getfCountry().toUpperCase());
		System.out.println("**************************************");
		System.out.println("Balance:  " + fBalance);
		System.out.println("**************************************");
	}
	
	@Override
	public boolean equals(Object o) {
		if(fAccountNumber == ((AbstractAccount)o).fAccountNumber)
			return true;
		else
			return false;
	}
	
	/**
	 * Withdraws the specified amount from this account.
	 * 
	 * @param amount The amount.
	 * 
	 * @return Success or failure of withdrawal.
	 */
	abstract boolean withdrawal(double amount);

}
