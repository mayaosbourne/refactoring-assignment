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
public class SavingsAccountTest2
{

	private Customer customerOne;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		customerOne = new Customer("Dawn Rocks", "Mocking Bird Ln", 
				"98146", "Seattle", "USA");
	}

	

	/**
	 * Test method for {@link SavingsAccount#SavingsAccount(Customer)}.
	 */
	@Test
	public void testSavingsAccount()
	{
		SavingsAccount saveTest = new SavingsAccount(customerOne);
		saveTest.print();
	}

	/**
	 * Test method for {@link SavingsAccount#calculateInterest()}.
	 */
	@Test
	public void testCalculateInterest()
	{
		SavingsAccount saveTest = new SavingsAccount(customerOne);
		saveTest.increaseBalance(10);
		saveTest.calculateInterest();
		assertEquals(saveTest.getBalance(), 10.125, 0.001);
	}
	
	/**
	 * Test method for {@link SavingsAccount#withdrawal(double)}.
	 */
	@Test
	public void testWithdrawal()
	{
		SavingsAccount saveTest2 = new SavingsAccount(customerOne);
		saveTest2.increaseBalance(10);
		assertTrue("Testing withdrawal of 2 from 10", saveTest2.withdrawal(2));
		assertFalse("Testing withdrawal of 100 from account", saveTest2.withdrawal(100));
	}

}
