
public class CheckingAccount 
{
	private int fAccountNumber;
	private Customer customer;
	private boolean fDebitAllowed;
	private double fDebitAmount;
	private double fBalance;
	private static double costs = 1; // per period there is a cost associated with this account
									// that equals 1 pound
	private static double debitRate = 4.7;
	private static CreditCard fCreditCard;
	private static SavingsAccount fSavingsAccount;
	private static DebitCard fDebitCard;
	private static int fNextAccountNumber = 0;
	
	public CheckingAccount(String name, String street, String zipCode, String town, String country)
	{
		customer = new Customer(name, street, zipCode, town, country);
		fAccountNumber = fNextAccountNumber;
		fNextAccountNumber++;
		fDebitAllowed = false;
		fDebitAmount = 0;
		
	}
	
	public CheckingAccount(String name, String street, String zipCode, String town, String country, float debit)
	{
		customer = new Customer(name, street, zipCode, town, country);
		fAccountNumber = fNextAccountNumber;
		fNextAccountNumber++;
		fDebitAllowed = true;
		fDebitAmount = debit;
	}
	
	public CheckingAccount(int accountnumber)
	{
		fAccountNumber = accountnumber;
	}
	
	public void determineCosts()
	{
		fBalance = fBalance - costs;
		if(fBalance < 0)
		{
			fBalance = fBalance - (fBalance * debitRate / 100);
		}
	}
	
	public void print()
	{
		System.out.println("**************************************");
		System.out.println("Savings account:     " + fAccountNumber);
		System.out.println("Account holder name: " + customer.getfName());
		System.out.println("Address:             " + customer.getfStreet());
		System.out.print("                     " + customer.getfZipcode());
		System.out.println(" " + customer.getfTown());
		System.out.println(customer.getfCountry().toUpperCase());
		System.out.println("**************************************");
		System.out.println("Balance:  " + fBalance);
		System.out.println("**************************************");
	}
	
	public boolean withdrawal(double amount)
	{
		if(((fBalance - amount) < 0) && (!fDebitAllowed))
		{
			return false;
		}
		else if((fBalance - amount) < -fDebitAmount)
		{
			fBalance = fBalance - amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void verseMoney(double amount)
	{
		fBalance += amount;
	}
	
	public boolean applyForCreditCard(String name, String street, String zipCode, String town, String country, int accountNumber)
	{
		if(fBalance < 0)
		{
			return false;
		}
		if(fBalance <= 2500)
		{
			fCreditCard = new CreditCard(name, street, town, zipCode, country);
		}
		else
		{
			fCreditCard = new CreditCard(name, street, town, zipCode, country, 5000);
		}
		return true;
	}
	
	public double getBalance()
	{
		return fBalance;
	}
	
	public void increaseBalance(double amount)
	{
		fBalance += amount;
	}
	
	public void decreaseBalance(double amount)
	{
		fBalance -= amount;
	}

	public double getDebitAmount()
	{
		return fDebitAmount;
	}

	public void setBalance(double amount)
	{
		fBalance = amount;	
	}

	public int getAccountNumber() 
	{
		return fAccountNumber;	
	}
	
	public boolean equals(Object o)
	{
		if(fAccountNumber == ((CheckingAccount)o).fAccountNumber)
			return true;
		else
			return false;
				
	}
}
