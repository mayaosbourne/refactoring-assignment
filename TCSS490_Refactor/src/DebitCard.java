
public class DebitCard 
{
	private static int fLastDebitCardNumber;
	private CheckingAccount fAccountConnectedTo;
	private int fDebitCardNumber;
	private Customer myCustomer;
	
	
	public DebitCard(Customer customer)
	{
		myCustomer = customer;
		fDebitCardNumber = fLastDebitCardNumber;
		fLastDebitCardNumber++;
	}
	
	public DebitCard(Customer customer, double limit, CheckingAccount account)
	{
		myCustomer = customer;
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
