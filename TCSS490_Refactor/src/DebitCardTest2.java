import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * These are the tests for DebitCard after refactoring was done.
 * 
 * @author Dawn Rocks & Maya Osbourne
 *
 */
public class DebitCardTest2
{

	private Customer customerOne;
	private CheckingAccount checkingAccOne;
	private CheckingAccount checkingAccTwo;
	private DebitCard debitCardOne;
	private DebitCard debitCardTwo;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		customerOne = new Customer("Dawn Rocks", "Mocking Bird Ln", 
				"98146", "Seattle", "USA");
		checkingAccOne = new CheckingAccount(customerOne);
		debitCardOne = new DebitCard(0, checkingAccOne);
		checkingAccTwo = new CheckingAccount(customerOne, 1);
		debitCardTwo = new DebitCard(10, checkingAccTwo);
		checkingAccTwo.increaseBalance(20.00);
	}

	/**
	 * Test method for {@link DebitCard#pay(double)}.
	 */
	@Test
	public void testPay()
	{
		assertTrue("Testing if", debitCardOne.pay(30.00));
		assertFalse("Testing else", debitCardTwo.pay(20.00));
	}

}
