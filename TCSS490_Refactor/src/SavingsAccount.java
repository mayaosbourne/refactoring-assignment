
public class SavingsAccount {
	private int fAccountNumber;
	private Customer customer;
	public double fBalance;
	private static double costs = 1; // per period there is a cost associated with this account
									// that equals 1 pound
	private static double interestRate = 1.25;
	private static int fNextAccountNumber = 0;
	
	public SavingsAccount(String name, String street, String zipCode, String town, String country)
	{
		customer = new Customer(name, street, zipCode, town, country);
		fAccountNumber = fNextAccountNumber;
		fNextAccountNumber++;
	}
	
	public void calculateInterest()
	{
		fBalance = fBalance + (fBalance * interestRate / 100);
	}
	
	public boolean withdrawal(double amount)
	{
		if(((fBalance - amount) < 0))
		{
			return false;
		}
		else
		{
			fBalance = fBalance - amount;
			return true;
		}
	}
	
	public void verseMoney(double amount)
	{
		fBalance += amount;
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
	
	
}
