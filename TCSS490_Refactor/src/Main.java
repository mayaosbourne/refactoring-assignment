/**
 * This class 
 * 
 * @author unknown
 * @author refactored by Maya Osbourne & Dawn Rocks
 * @version 4.25.2014
 *
 */
public class Main {
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		int accountnumber = bank.openSimpleCheckingAccount();
		if(bank.withdrawMoney(accountnumber, 2525))
			System.out.println("Success");
		else
			System.out.println("Failure");

	}

}
