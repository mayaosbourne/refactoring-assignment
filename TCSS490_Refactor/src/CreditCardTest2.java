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
public class CreditCardTest2
{
	private CreditCard creditCardOne;
	
	private CreditCard creditCardTwo;


	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{

		creditCardOne = new CreditCard();	
		creditCardTwo = new CreditCard(20.00);
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
