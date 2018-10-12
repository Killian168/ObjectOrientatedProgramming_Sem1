/**
 * Description: This holds the address of someone
 * including their zip code, town, street, and country
 * @author Killian O'Dálaigh
 * @version 10 October 2018
 */

public class Address {

	private String street;
	private String town;
	private String zip;
	private String country;
	
	/*
	 * Class Constructor with no address
	 */
	public Address() {
		street = null;
		town = null;
		zip = null;
		country = null;
	}// End Constructor
	
	/*
	 * Class Constructor given address
	 */
	public Address(String str, String twn, String zp, String contry) {
		street = str;
		town = twn;
		zip = zp;
		country = contry;
	}// End Constructor

	/*
	 * Methods
	 */
	
	// Creates a single string of the Address in a single line
	public String catAddress() {
		return (street + "," + town + "," + zip + "," + country);
	}
	
	// Creates a String of the Address going to new lines after each attribute
	public String catAddressNewLine() {
		return (street + ",\n" + town + ",\n" + zip + ",\n" + country);
	}
	
	// Checks if the Object is empty or not
	public boolean isEmpty() {
		if((this.street != null && !this.street.isEmpty())&&((this.town != null && !this.town.isEmpty()))&&((this.zip != null && !this.zip.isEmpty()))&&((this.country != null && !this.country.isEmpty())))
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	
	/*
	 * Getters and Setters
	 */
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}// End Class Address
