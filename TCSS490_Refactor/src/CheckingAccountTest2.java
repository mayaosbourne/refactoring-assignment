import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CheckingAccountTest2
{
	private CheckingAccount checkingAccOne;
	
	private CheckingAccount checkingAccTwo;
	
	private CheckingAccount checkingAccThree;

	private Customer customerOne;

	@Before
	public void setUp() throws Exception
	{
		customerOne = new Customer("Dawn Rocks", "Mocking Bird Ln", 
				"98146", "Seattle", "USA");
		checkingAccOne = new CheckingAccount(customerOne);
		checkingAccTwo = new CheckingAccount(customerOne, 1);
		checkingAccThree = new CheckingAccount(3);
	}

	@Test
	public void testWithdrawal()
	{
		assertFalse("Testing withdrawal", checkingAccOne.withdrawal(0));
		
		assertFalse("Testing withdrawal false", checkingAccOne.withdrawal(2));
		
		assertTrue("Testing withdrawal true", checkingAccTwo.withdrawal(2));
	}


	@Test
	public void testDetermineCosts()
	{
		checkingAccThree.determineCosts();
		assertEquals(-0.953, checkingAccThree.getBalance(), 1);
	}

	@Test
	public void testGetDebitAmount()
	{
		CheckingAccount checkOne = new CheckingAccount(customerOne, 1);
		
		assertEquals(1, checkOne.getDebitAmount(), 0.001);
	}

	@Test
	public void testGetAccountNumber()
	{
		CheckingAccount checkOne = new CheckingAccount(customerOne, 1);		
		assertEquals(29, checkOne.getAccountNumber(), 0.001); //Account number should be 9 at this point due
															 //to how program functions
	}

	@Test
	public void testEqualsObject()
	{
		assertFalse("Testing if checkingAccOne equals checkingAccTwo", checkingAccOne.equals(checkingAccTwo));
		assertTrue("Test if checkingAccOne equals itself", checkingAccOne.equals(checkingAccOne));
	}

}
