
public class DebitCard 
{
	private CheckingAccount fAccountConnectedTo;
	
	public DebitCard(double limit, CheckingAccount account)
	{
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
