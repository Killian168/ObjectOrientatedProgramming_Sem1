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
	
	public Address() {
		street = null;
		town = null;
		zip = null;
		country = null;
	}// End Constructor
	
	public Address(String str, String twn, String zp, String contry) {
		street = str;
		town = twn;
		zip = zp;
		country = contry;
	}// End Constructor

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
	
	public String catAddress() {
		return (street + "," + town + "," + zip + "," + country);
	}
	
	public boolean isEmpty() {
		if((this.street != null && !this.street.isEmpty())&&((this.town != null && !this.town.isEmpty()))&&((this.zip != null && !this.zip.isEmpty()))&&((this.country != null && !this.country.isEmpty())))
		{
			return true;
		}
		else {
			return false;
		}
	}
}// End Class Address
