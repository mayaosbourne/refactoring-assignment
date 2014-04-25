import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Maya
 *
 */
public class CheckingAccountTest {

	private CheckingAccount checkingAccOne;
	
	private CheckingAccount checkingAccTwo;
	
	private CheckingAccount checkingAccThree;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		checkingAccOne = new CheckingAccount("Dawn Rocks", "Mocking Bird Ln", "98146", "Seattle", "USA");
		checkingAccTwo = new CheckingAccount("Dawn Rocks", "Mocking Bird Ln", "98146", "Seattle", "USA", 1);
		checkingAccThree = new CheckingAccount(1);
	}

	/**
	 * Test method for {@link CheckingAccount#determineCosts()}.
	 */
	@Test
	public void testDetermineCosts() {
		
		checkingAccThree.determineCosts();
		assertEquals(-0.953, checkingAccThree.getBalance(), 1);
		
	}

	/**
	 * Test method for {@link CheckingAccount#withdrawal(double)}.
	 */
	@Test
	public void testWithdrawal() {
		assertFalse("Testing withdrawal", checkingAccOne.withdrawal(0));
		
		assertFalse("Testing withdrawal false", checkingAccOne.withdrawal(2));
		
		assertTrue("Testing withdrawal true", checkingAccTwo.withdrawal(2));
	}

	/**
	 * Test method for {@link CheckingAccount#verseMoney(double)}.
	 */
	@Test
	public void testVerseMoney() {
		checkingAccOne.verseMoney(2);
		checkingAccOne.print();
		assertEquals(checkingAccOne.getBalance(), 2.0, 0.1);
	}

	/**
	 * Test method for {@link CheckingAccount#applyForCreditCard(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int)}.
	 */
	@Test
	public void testApplyForCreditCard() {
		
		CheckingAccount checkingAccFour = new CheckingAccount("Dawn Rocks", "Mocking Bird Ln", 
				"98146", "Seattle", "USA", 1);
		
		assertTrue("Testing Apply for Credit", checkingAccFour.applyForCreditCard("Dawn Rocks", "Mocking Bird Ln", 
				"98146", "Seattle", "USA", 1));
		
		checkingAccFour.withdrawal(10000);
		
		assertFalse(checkingAccFour.applyForCreditCard("Dawn Rocks", "Mocking Bird Ln", 
				"98146", "Seattle", "USA", 1));
		
		checkingAccFour.verseMoney(100000000);
		assertTrue(checkingAccFour.applyForCreditCard("Dawn Rocks", "Mocking Bird Ln", 
				"98146", "Seattle", "USA", 1));
	}

	/**
	 * Test method for {@link CheckingAccount#getBalance()}.
	 */
	@Test
	public void testGetBalance() {
		CheckingAccount checkOne = new CheckingAccount("Dawn Rocks", "Mocking Bird Ln", 
				"98146", "Seattle", "USA", 1);
		assertEquals(0, checkOne.getBalance(), 0.001);
	}

	/**
	 * Test method for {@link CheckingAccount#increaseBalance(double)}.
	 */
	@Test
	public void testIncreaseBalance() {
		CheckingAccount checkOne = new CheckingAccount("Dawn Rocks", "Mocking Bird Ln", 
				"98146", "Seattle", "USA", 1);
		checkOne.increaseBalance(1);
		assertEquals(1, checkOne.getBalance(), 0.001);
	}

	/**
	 * Test method for {@link CheckingAccount#decreaseBalance(double)}.
	 */
	@Test
	public void testDecreaseBalance() {
		CheckingAccount checkOne = new CheckingAccount("Dawn Rocks", "Mocking Bird Ln", 
				"98146", "Seattle", "USA", 1);
		checkOne.decreaseBalance(1);
		assertEquals(-1, checkOne.getBalance(), 0.0001);
	}

	/**
	 * Test method for {@link CheckingAccount#getDebitAmount()}.
	 */
	@Test
	public void testGetDebitAmount() {
		CheckingAccount checkOne = new CheckingAccount("Dawn Rocks", "Mocking Bird Ln", 
				"98146", "Seattle", "USA", 1);
		
		assertEquals(1, checkOne.getDebitAmount(), 0.001);
	}

	/**
	 * Test method for {@link CheckingAccount#setBalance(double)}.
	 */
	@Test
	public void testSetBalance() {
		CheckingAccount checkOne = new CheckingAccount("Dawn Rocks", "Mocking Bird Ln", 
				"98146", "Seattle", "USA", 1);
		checkOne.setBalance(1000);
		assertEquals(1000, checkOne.getBalance(), 0.001);
	}

	/**
	 * Test method for {@link CheckingAccount#getAccountNumber()}.
	 */
	@Test
	public void testGetAccountNumber() {
		CheckingAccount checkOne = new CheckingAccount("Dawn Rocks", "Mocking Bird Ln", 
				"98146", "Seattle", "USA", 1);
		
		assertEquals(26, checkOne.getAccountNumber(), 0.001);
	}

	/**
	 * Test method for {@link CheckingAccount#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObject() {
		assertFalse("Testing if checkingAccOne equals checkingAccTwo", checkingAccOne.equals(checkingAccTwo));
		assertTrue("Test if checkingAccOne equals itself", checkingAccOne.equals(checkingAccOne));
	}

}
