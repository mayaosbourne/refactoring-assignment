import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Dawn
 *
 */
public class CreditCardTest
{
	private CreditCard creditCardOne;
	
	private CreditCard creditCardTwo;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		creditCardOne = new CreditCard("Dawn Rocks", "Mocking Bird Ln", "Seattle", "98146", "USA");	
		creditCardTwo = new CreditCard("Dawn Rocks", "Mocking Bird Ln", "Seattle", "98146", "USA", 20.00);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}

	/**
	 * Test method for {@link CreditCard#pay(double)}.
	 */
	@Test
	public void testPay()
	{
		
		assertFalse("Testing if payment is less than balance", creditCardOne.pay(20.00));
		assertTrue("Testing if payment is equal to or greater than balance", creditCardTwo.pay(25.00));
	}

}
