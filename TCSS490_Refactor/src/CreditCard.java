
public class CreditCard 
{
	private static int fLastCreditCardNumber;
	private int fAccountConnectedTo;
	private int fCreditCardNumber;
	private String fName;
	private String fStreet;
	private String fTown;
	private String fzipCode;
	private String fCountry;
	private double fLimit; // you cannot spend more than this limit
	private double fBalance;
	private Customer customer;
	
	public CreditCard(String name, String street, String town, String zipCode, String country)
	{
		customer = new Customer(name, street, zipCode, town, country);
		fLimit = 2500; // standard limit
		fBalance = 0;
	}
	
	public CreditCard(String name, String street, String town, String zipCode, String country, double limit)
	{
		customer = new Customer(name, street, zipCode, town, country);
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
