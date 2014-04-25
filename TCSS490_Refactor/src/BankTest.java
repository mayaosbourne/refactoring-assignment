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
public class BankTest {

	private Bank bankTest;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		bankTest = new Bank("Dawn Rocks");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}


	/**
	 * Test method for {@link Bank#openSimpleCheckingAccount()}.
	 */
	@Test
	public void testOpenSimpleCheckingAccount() {
		int accountNum = bankTest.openSimpleCheckingAccount();
		assertEquals("Test OpenSimpleCheckingAccount", 0, accountNum);
	}

	/**
	 * Test method for {@link Bank#openFullPackage()}.
	 */
	@Test
	public void testOpenFullPackage() {
		int accountNum = bankTest.openFullPackage();
		assertEquals("Test OpenFullPackage", 1, accountNum);
	}

	/**
	 * Test method for {@link Bank#withdrawMoney(int, double)}.
	 */
	@Test
	public void testWithdrawMoney() {
		int accountNum = bankTest.openSimpleCheckingAccount();
		assertFalse("Test withdraw money", bankTest.withdrawMoney(accountNum, 5));
	}

}
