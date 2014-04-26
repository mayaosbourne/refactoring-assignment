
public class SavingsAccount {
	private int fAccountNumber;
	private Customer myCustomer;
	public double fBalance;
	private static double interestRate = 1.25;
	
	public SavingsAccount(Customer customer)
	{
		myCustomer = customer;
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
		System.out.println("Account holder name: " + myCustomer.getfName());
		System.out.println("Address:             " + myCustomer.getfStreet());
		System.out.print("                     " + myCustomer.getfZipcode());
		System.out.println(" " + myCustomer.getfTown());
		System.out.println(myCustomer.getfCountry().toUpperCase());
		System.out.println("**************************************");
		System.out.println("Balance:  " + fBalance);
		System.out.println("**************************************");
	}
	
	
}
