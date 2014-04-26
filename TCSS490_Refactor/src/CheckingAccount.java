
public class CheckingAccount extends AbstractAccount {
	
	private int fAccountNumber;
	private boolean fDebitAllowed;
	private double fDebitAmount;
	private double fBalance;
	private static double costs = 1; // per period there is a cost associated with this account
									// that equals 1 pound
	private static double debitRate = 4.7;
	private static int fNextAccountNumber = 0;
	
	public CheckingAccount(Customer customer) {
		super(customer);
		fAccountNumber = fNextAccountNumber;
		fNextAccountNumber++;
		fDebitAllowed = false;
		fDebitAmount = 0;
	}
	
	public CheckingAccount(Customer customer, float debit) {
		super(customer);
		fAccountNumber = fNextAccountNumber;
		fNextAccountNumber++;
		fDebitAllowed = true;
		fDebitAmount = debit;
	}
	
	public CheckingAccount(int accountnumber) {
		fAccountNumber = accountnumber;
	}
	
	public void determineCosts() {
		fBalance = fBalance - costs;
		if(fBalance < 0) {
			fBalance = fBalance - (fBalance * debitRate / 100);
		}
	}

	public boolean withdrawal(double amount) {
		if(((fBalance - amount) < 0) && (!fDebitAllowed)) {
			return false;
		} else if((fBalance - amount) < -fDebitAmount) {
			fBalance = fBalance - amount;
			return true;
		} else {
			return false;
		}
	}

	public double getDebitAmount() {
		return fDebitAmount;
	}

	public void setBalance(double amount) {
		fBalance = amount;	
	}

	public int getAccountNumber() {
		return fAccountNumber;	
	}
	
	public boolean equals(Object o) {
		if(fAccountNumber == ((CheckingAccount)o).fAccountNumber)
			return true;
		else
			return false;
	}
	
}
