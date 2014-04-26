
public abstract class AbstractAccount {

	private int fAccountNumber;
	private double fBalance;
	private Customer myCustomer;
	
	public AbstractAccount() {
		
	}
	
	public AbstractAccount(Customer customer) {
		myCustomer = customer;
	}
	
	public void increaseBalance(double amount) {
		fBalance += amount;
	}
	
	public void decreaseBalance(double amount) {
		fBalance -= amount;
	}
	
	public double getBalance() {
		return fBalance;
	}
	
	public void print() {
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
	
	abstract boolean withdrawal(double amount);

}
