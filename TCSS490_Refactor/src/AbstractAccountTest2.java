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
public class AbstractAccountTest2
{

	private Customer customerOne;
	
	private CheckingAccount checkingAccOne;
	
	private CheckingAccount checkingAccTwo;
	
	@SuppressWarnings("unused")
	private CheckingAccount checkingAccThree;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		checkingAccOne = new CheckingAccount(customerOne);
		checkingAccTwo = new CheckingAccount(customerOne, 1);
		customerOne = new Customer("Dawn Rocks", "Mocking Bird Ln", 
				"98146", "Seattle", "USA");
		checkingAccThree = new CheckingAccount(3);
	}

//	/**
//	 * Test method for {@link AbstractAccount#AbstractAccount()}.
//	 */
//	@Test
//	public void testAbstractAccount()
//	{
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link AbstractAccount#AbstractAccount(Customer)}.
//	 */
//	@Test
//	public void testAbstractAccountCustomer()
//	{
//		fail("Not yet implemented");
//	}

	/**
	 * Test method for {@link AbstractAccount#increaseBalance(double)}.
	 */
	@Test
	public void testIncreaseBalance()
	{
		CheckingAccount checkOne = new CheckingAccount(customerOne, 1);
		checkOne.print();
		checkOne.increaseBalance(1);
		assertEquals(1, checkOne.getBalance(), 0.001);
	}

	/**
	 * Test method for {@link AbstractAccount#decreaseBalance(double)}.
	 */
	@Test
	public void testDecreaseBalance()
	{
		CheckingAccount checkOne = new CheckingAccount(customerOne, 1);
		checkOne.decreaseBalance(1);
		assertEquals(-1, checkOne.getBalance(), 0.0001);
	}

	/**
	 * Test method for {@link AbstractAccount#getBalance()}.
	 */
	@Test
	public void testGetBalance()
	{
		CheckingAccount checkOne = new CheckingAccount(customerOne, 1);
		assertEquals(0, checkOne.getBalance(), 0.001);
	}


	/**
	 * Test method for {@link AbstractAccount#withdrawal(double)}.
	 */
	@Test
	public void testWithdrawal()
	{
		assertFalse("Testing withdrawal", checkingAccOne.withdrawal(0));
		
		assertFalse("Testing withdrawal false", checkingAccOne.withdrawal(2));
		
		assertTrue("Testing withdrawal true", checkingAccTwo.withdrawal(2));
	}
	
	/**
	 * Test method for {@link AbstractAccount#setBalance(double)}.
	 */
	@Test
	public void testSetBalance()
	{
		CheckingAccount checkOne = new CheckingAccount(customerOne, 1);
		checkOne.setBalance(1000);
		assertEquals(1000, checkOne.getBalance(), 0.001);
	}

}
