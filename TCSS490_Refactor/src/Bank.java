import java.util.Vector;


public class Bank 
{
	private String fName;
	private Customer fCustomer;
	private CreditCard fCreditCard;
	private Vector<CheckingAccount> fCheckingAccounts;
	private Vector<SavingsAccount> fSavingAccounts;
	
	public Bank(String name)
	{
		fName = name;
		fCheckingAccounts = new Vector<CheckingAccount>();
		fSavingAccounts = new Vector<SavingsAccount>();
		fCustomer = new Customer("Bob Smith", "1 Main St.", "12345", "Tacoma", "USA");
	}
	
	public int openSimpleCheckingAccount()
	{
		CheckingAccount newAccount = new CheckingAccount(fCustomer);
		fCheckingAccounts.add(newAccount);
		return newAccount.getAccountNumber();
	}
	
	public int openFullPackage()
	{
		CheckingAccount newAccount = new CheckingAccount(fCustomer);
		fCheckingAccounts.add(newAccount);
		applyForCreditCard(fCustomer, newAccount);
		SavingsAccount newSavingsAccount = new SavingsAccount(fCustomer);
		fSavingAccounts.add(newSavingsAccount);
		DebitCard newDebetCard = new DebitCard(fCustomer, 0, newAccount);
		return newAccount.getAccountNumber();
	}
	
	public boolean applyForCreditCard(Customer customer, CheckingAccount account)
	{
		if(account.getBalance() < 0)
		{
			return false;
		}
		if(account.getBalance() <= 2500)
		{
			fCreditCard = new CreditCard(customer);
		}
		else
		{
			fCreditCard = new CreditCard(customer, 5000);
		}
		return true;
	}
	
	public boolean withdrawMoney(int accountNumber, double amount)
	{
		CheckingAccount account = new CheckingAccount(accountNumber);
		int index = fCheckingAccounts.indexOf(account);
		return fCheckingAccounts.elementAt(index).withdrawal(amount);
	}
	
}
