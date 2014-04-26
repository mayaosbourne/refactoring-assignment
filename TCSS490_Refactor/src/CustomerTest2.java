import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * These are the tests for the Customer class after refactoring was done.
 * 
 * @author Dawn Rocks & Maya Osbourne
 *
 */
public class CustomerTest2
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
	 * Test method for {@link Customer#getfName()}.
	 */
	@Test
	public void testGetfName()
	{
		assertEquals("Testing name", "Dawn Rocks", customerOne.getfName());
	}

	/**
	 * Test method for {@link Customer#getfStreet()}.
	 */
	@Test
	public void testGetfStreet()
	{
		assertEquals("Testing street", "Mocking Bird Ln", customerOne.getfStreet());
	}

	/**
	 * Test method for {@link Customer#getfZipcode()}.
	 */
	@Test
	public void testGetfZipcode()
	{
		assertEquals("Testing zip code", "98146", customerOne.getfZipcode());
	}

	/**
	 * Test method for {@link Customer#getfTown()}.
	 */
	@Test
	public void testGetfTown()
	{
		assertEquals("Testing town", "Seattle", customerOne.getfTown());
	}

	/**
	 * Test method for {@link Customer#getfCountry()}.
	 */
	@Test
	public void testGetfCountry()
	{
		assertEquals("Testing country", "USA", customerOne.getfCountry());
	}

}
