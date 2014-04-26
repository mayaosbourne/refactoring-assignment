
public class CreditCard 
{
	private double fLimit; // you cannot spend more than this limit
	private double fBalance;
	
	public CreditCard()
	{
		fLimit = 2500; // standard limit
		fBalance = 0;
	}
	
	public CreditCard(double limit)
	{
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
