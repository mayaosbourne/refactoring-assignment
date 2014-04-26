
public class CheckingAccount 
{
	private int fAccountNumber;
	private Customer myCustomer;
	private boolean fDebitAllowed;
	private double fDebitAmount;
	private double fBalance;
	private static double costs = 1; // per period there is a cost associated with this account
									// that equals 1 pound
	private static double debitRate = 4.7;
	private static CreditCard fCreditCard;
	private static int fNextAccountNumber = 0;
	
	public CheckingAccount(Customer customer)
	{
		myCustomer = customer;
		fAccountNumber = fNextAccountNumber;
		fNextAccountNumber++;
		fDebitAllowed = false;
		fDebitAmount = 0;
		
	}
	
	public CheckingAccount(Customer customer, float debit)
	{
		myCustomer = customer;
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
		System.out.println("Account holder name: " + myCustomer.getfName());
		System.out.println("Address:             " + myCustomer.getfStreet());
		System.out.print("                     " + myCustomer.getfZipcode());
		System.out.println(" " + myCustomer.getfTown());
		System.out.println(myCustomer.getfCountry().toUpperCase());
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
