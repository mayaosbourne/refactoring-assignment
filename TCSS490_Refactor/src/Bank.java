import java.util.Vector;

/**
 * This is the Bank class, which specifies the behavior associated
 * with a bank.
 * 
 * @author original author unknown
 * @author refactored by Maya Osbourne & Dawn Rocks
 * @version 4.25.2014
 */
public class Bank {

	/**
	 * The customer.
	 */
	private Customer fCustomer;
	
	/**
	 * The credit card.
	 */
	private CreditCard fCreditCard;
	
	/**
	 * The checking accounts.
	 */
	private Vector<CheckingAccount> fCheckingAccounts;
	
	/**
	 * The savings account.
	 */
	private Vector<SavingsAccount> fSavingAccounts;
	
	/**
	 * The bank constructor, creates a new vector of Checking Accounts
	 * and Savings Accounts and a new customer.
	 */
	public Bank() {
		fCheckingAccounts = new Vector<CheckingAccount>();
		fSavingAccounts = new Vector<SavingsAccount>();
		fCustomer = new Customer("Bob Smith", "1 Main St.", "12345", "Tacoma", "USA");
	}
	
	/**
	 * Open a simple checking account and return its account number.
	 * 
	 * @return The checking account number.
	 */
	public int openSimpleCheckingAccount() {
		CheckingAccount newAccount = new CheckingAccount(fCustomer);
		fCheckingAccounts.add(newAccount);
		System.out.println(fCheckingAccounts.elements());
		return newAccount.getAccountNumber();
	}
	
	public int openFullPackage() {
		CheckingAccount newAccount = new CheckingAccount(fCustomer);
		fCheckingAccounts.add(newAccount);
		applyForCreditCard(fCustomer, newAccount);
		SavingsAccount newSavingsAccount = new SavingsAccount(fCustomer);
		fSavingAccounts.add(newSavingsAccount);
		DebitCard newDebitCard = new DebitCard(0, newAccount);
		return newAccount.getAccountNumber();
	}
	
	/**
	 * Apply for a credit card, success if balance check succeeds.
	 * 
	 * @param customer The customer.
	 * @param account The checking account.
	 * @return Success or failure?
	 */
	public boolean applyForCreditCard(Customer customer, CheckingAccount account) {
		if(account.getBalance() < 0) {
			return false;
		}
		if(account.getBalance() <= 2500) {
			fCreditCard = new CreditCard();
		} else {
			fCreditCard = new CreditCard(5000);
		}
		return true;
	}
	
	/**
	 * Withdraw money from the checking account.
	 * 
	 * @param accountNumber The account number.
	 * @param amount The amount to withdraw.
	 * @return Success or failure?
	 */
	public boolean withdrawMoney(int accountNumber, double amount) {
		CheckingAccount account = new CheckingAccount(accountNumber);
		int index = fCheckingAccounts.indexOf(account);
		return fCheckingAccounts.elementAt(index).withdrawal(amount);
	}
}
