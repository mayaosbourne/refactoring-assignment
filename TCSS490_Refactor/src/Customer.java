/**
 * The Customer class, which defines attributes associated
 * to a customer. 
 * 
 * @author original author unknown
 * @author refactored by Maya Osbourne & Dawn Rocks
 * @version 4.25.2014
 *
 */
public class Customer {
	
	/**
	 * The customer's name.
	 */
	private String fName;
	
	/**
	 * The customer's street.
	 */
	private String fStreet;
	
	/**
	 * The customer's zip code.
	 */
	private String fZipcode;
	
	/**
	 * The customer's town.
	 */
	private String fTown;
	
	/**
	 * The customer's country.
	 */
	private String fCountry;

	/**
	 * The constructor for the customer.
	 * 
	 * @param name The customer name.
	 * @param street The customer's street.
	 * @param zipCode The customer's zip code.
	 * @param town The customer's town.
	 * @param country The customer's country.
	 */
	public Customer(String name, String street, String zipCode, String town, String country) {
		fName = name;
		fStreet = street;
		fZipcode = zipCode;
		fTown = town;
		fCountry = country;
	}

	/**
	 * Get the customer's name.
	 * 
	 * @return The name.
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * Get the customer's street.
	 * 
	 * @return The street.
	 */
	public String getfStreet() {
		return fStreet;
	}

	/**
	 * Get the customer's zip code.
	 * 
	 * @return The zip code.
	 */
	public String getfZipcode() {
		return fZipcode;
	}
	
	/**
	 * Get the customer's town.
	 * 
	 * @return The town.
	 */
	public String getfTown() {
		return fTown;
	}

	/**
	 * Get the customer's country.
	 * 
	 * @return The country.
	 */
	public String getfCountry() {
		return fCountry;
	}
}
