import static org.junit.Assert.*;
import junit.framework.AssertionFailedError;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DebitCardTest
{
	
	private DebitCard debitCardOne;
	private CheckingAccount checkingOne;
	private CheckingAccount checkingTwo;
	private DebitCard debitCardTwo;
	private DebitCard debitCardThree;


	@Before
	public void setUp() throws Exception
	{
		checkingOne = new CheckingAccount("Dawn Rocks", "Mocking Bird Ln", "Seattle", "98146", "USA", 15);
		debitCardOne = new DebitCard("Dawn Rocks", "Mocking Bird Ln", "Seattle", "98146", "USA", 0, checkingOne);
		checkingTwo = new CheckingAccount("Dawn Rocks", "Mocking Bird Ln", "Seattle", "98146", "USA", 15);
		debitCardTwo = new DebitCard("Dawn Rocks", "Mocking Bird Ln", "Seattle", "98146", "USA", 10, checkingTwo);
		checkingTwo.increaseBalance(20.00);
		
		
	}
	@Test
	public void testDebitCard()
	{
		debitCardThree = new DebitCard("Dawn Rocks", "Mocking Bird Ln", "Seattle", "98146", "USA");
	}

	@Test
	public void testPay()
	{
		assertTrue("Testing if", debitCardOne.pay(30.00));
		assertFalse("Testing else", debitCardTwo.pay(20.00));
	}


	private void AssertionFailedError(boolean pay)
	{
		// TODO Auto-generated method stub
		
	}


	private void assertError(boolean pay)
	{
		// TODO Auto-generated method stub
		
	}

}
