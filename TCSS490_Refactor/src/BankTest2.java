import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Dawn
 *
 */
public class BankTest2
{

	private Bank bankTest;
	private Bank bankTest1;
	
	private Customer customerOne;
	private Customer customerTwo;
	private Bank bankTest2;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		bankTest = new Bank();
		bankTest1 = new Bank();
		bankTest2 = new Bank();
		customerOne = new Customer("Dawn Rocks", "Mocking Bird Ln", 
				"98146", "Seattle", "USA");
		customerTwo = new Customer("Maya Rocks Also", "Mocking Bird Ln", 
				"98146", "Seattle", "USA");
		
	}

	/**
	 * Test method for {@link Bank#openSimpleCheckingAccount()}.
	 */
	@Test
	public void testOpenSimpleCheckingAccount()
	{
		int accountNum = bankTest.openSimpleCheckingAccount();
		assertEquals("Test OpenSimpleCheckingAccount", 14, accountNum);
	}

	/**
	 * Test method for {@link Bank#openFullPackage()}.
	 */
	@Test
	public void testOpenFullPackage()
	{
		int accountNum1 = bankTest1.openFullPackage();
		assertEquals("Test OpenFullPackage", 17, accountNum1);
	}

	/**
	 * Test method for {@link Bank#applyForCreditCard(Customer, CheckingAccount)}.
	 */
	@Test
	public void testApplyForCreditCard()
	{
		CheckingAccount checkingAccOne = new CheckingAccount(customerOne, 1);
		
		CheckingAccount checkingAccTwo = new CheckingAccount(customerTwo, 1);
		
		assertTrue("Testing Apply for Credit", bankTest.applyForCreditCard(customerOne, checkingAccOne));
		
		checkingAccTwo.decreaseBalance(100000);
		
		assertFalse(bankTest.applyForCreditCard(customerTwo, checkingAccTwo));
		
		checkingAccOne.increaseBalance(100000000);
		assertTrue(bankTest.applyForCreditCard(customerOne, checkingAccOne));
	}

	/**
	 * Test method for {@link Bank#withdrawMoney(int, double)}.
	 */
	@Test
	public void testWithdrawMoney() {
		int accountNum = bankTest.openSimpleCheckingAccount();
		assertFalse("Test withdraw money", bankTest.withdrawMoney(accountNum, 0));
	}

}
