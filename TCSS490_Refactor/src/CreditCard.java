
public class CreditCard 
{
	private static int fLastCreditCardNumber;
	private int fAccountConnectedTo;
	private int fCreditCardNumber;
	private double fLimit; // you cannot spend more than this limit
	private double fBalance;
	private Customer myCustomer;
	
	public CreditCard(Customer customer)
	{
		myCustomer = customer;
		fLimit = 2500; // standard limit
		fBalance = 0;
	}
	
	public CreditCard(Customer customer, double limit)
	{
		myCustomer = customer;
		fLimit = limit;
		fBalance = 0;
	}
	
	public boolean pay(double amount)
	{
		if((fBalance - amount) < -fLimit)
		{
			fBalance -= amount;
			return true;
		}
		else
		{
			return false;
		}
	}
}
