/**
 * This class 
 * 
 * @author unknown
 * @author refactored by Maya Osbourne & Dawn Rocks
 * @version 4.25.2014
 *
 */
public class Customer {
	private String fName;
	private String fStreet;
	private String fZipcode;
	private String fTown;
	private String fCountry;

	public Customer(String name, String street, String zipCode, String town, String country) {
		fName = name;
		fStreet = street;
		fZipcode = zipCode;
		fTown = town;
		fCountry = country;
	}

	public String getfName() {
		return fName;
	}

	public String getfStreet() {
		return fStreet;
	}

	public String getfZipcode() {
		return fZipcode;
	}

	public String getfTown() {
		return fTown;
	}

	public String getfCountry() {
		return fCountry;
	}

}
