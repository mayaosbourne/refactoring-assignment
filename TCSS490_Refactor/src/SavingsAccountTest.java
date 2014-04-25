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
public class SavingsAccountTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link SavingsAccount#SavingsAccount(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testSavingsAccount() {
		SavingsAccount saveTest = new SavingsAccount("blah1", "blah2", "blah3", "blah4", "blah5");
		saveTest.print();
	}

	/**
	 * Test method for {@link SavingsAccount#calculateInterest()}.
	 */
	@Test
	public void testCalculateInterest() {
		SavingsAccount saveTest = new SavingsAccount("blah1", "blah2", "blah3", "blah4", "blah5");
		saveTest.verseMoney(10);
		saveTest.calculateInterest();
		assertEquals(saveTest.fBalance, 10.125, 0.001);
	}

	/**
	 * Test method for {@link SavingsAccount#withdrawal(double)}.
	 */
	@Test
	public void testWithdrawal() {
		SavingsAccount saveTest2 = new SavingsAccount("blah1", "blah2", "blah3", "blah4", "blah5");
		saveTest2.verseMoney(10);
		assertTrue("Testing withdrawal of 2 from 10", saveTest2.withdrawal(2));
		assertFalse("Testing withdrawal of 100 from account", saveTest2.withdrawal(100));
	}

	/**
	 * Test method for {@link SavingsAccount#verseMoney(double)}.
	 */
	@Test
	public void testVerseMoney() {
		SavingsAccount saveTest3 = new SavingsAccount("blah1", "blah2", "blah3", "blah4", "blah5");
		saveTest3.verseMoney(10);
		assertEquals(saveTest3.fBalance, 10.0, 0.001);
	}

}
