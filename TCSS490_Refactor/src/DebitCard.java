
public class DebitCard 
{
	private static int fLastDebitCardNumber;
	private CheckingAccount fAccountConnectedTo;
	private int fDebitCardNumber;
	private String fName;
	private String fStreet;
	private String fTown;
	private String fZipCode;
	private String fCountry;
	private Customer customer;
	
	
	public DebitCard(String name, String street, String town, String zipCode, String country)
	{
		customer = new Customer(name, street, zipCode, town, country);
		fDebitCardNumber = fLastDebitCardNumber;
		fLastDebitCardNumber++;
	}
	
	public DebitCard(String name, String street, String town, String zipCode, String country, double limit, CheckingAccount account)
	{
		customer = new Customer(name, street, zipCode, town, country);
		fDebitCardNumber = fLastDebitCardNumber;
		fLastDebitCardNumber++;
		fAccountConnectedTo = account;
	}
	
	public boolean pay(double amount)
	{
		if((fAccountConnectedTo.getBalance() - amount) < -fAccountConnectedTo.getDebitAmount())
		{
			fAccountConnectedTo.setBalance(fAccountConnectedTo.getBalance() - amount);
			return true;
		}
		else
		{
			return false;
		}
	}

}
