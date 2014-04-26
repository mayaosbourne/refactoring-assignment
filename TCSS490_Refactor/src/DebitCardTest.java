import static org.junit.Assert.*;
import junit.framework.AssertionFailedError;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * These are the tests for DebitCard before refactoring was done.
 * 
 * Errors are present due to changes from refactoring.
 * 
 * @author Dawn Rocks & Maya Osbourne
 */
public class DebitCardTest
{
	
	private DebitCard debitCardOne;
	private CheckingAccount checkingOne;
	private CheckingAccount checkingTwo;
	private DebitCard debitCardTwo;

	/**
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		checkingOne = new CheckingAccount("Dawn Rocks", "Mocking Bird Ln", "Seattle", "98146", "USA", 15);
		debitCardOne = new DebitCard("Dawn Rocks", "Mocking Bird Ln", "Seattle", "98146", "USA", 0, checkingOne);
		checkingTwo = new CheckingAccount("Dawn Rocks", "Mocking Bird Ln", "Seattle", "98146", "USA", 15);
		debitCardTwo = new DebitCard("Dawn Rocks", "Mocking Bird Ln", "Seattle", "98146", "USA", 10, checkingTwo);
		checkingTwo.increaseBalance(20.00);
		
		
	}
	
	/**
	 * Test for DebitCard constructor.
	 */
	@Test
	public void testDebitCard()
	{
		debitCardThree = new DebitCard("Dawn Rocks", "Mocking Bird Ln", "Seattle", "98146", "USA");
	}

	/**
	 * Test for the pay method in the DebitCard class.
	 */
	@Test
	public void testPay()
	{
		assertTrue("Testing if", debitCardOne.pay(30.00));
		assertFalse("Testing else", debitCardTwo.pay(20.00));
	}

}
