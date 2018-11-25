/**
 * Gets all the info from the user
 */

/**
 * @author killian
 * @version 15 November 2018
 */

import java.util.Date;

public class GetInfo {
	private String startingLocation; 
	private String destination;
	private Date dateOfDeparture;
	private Date dateOfArrival;
	
	public GetInfo() {
		this.getInfo();
	}// End constructor

	public void getInfo() {
		// Gets info of desired trip from user
	}// End getInfo
	
	/**
	 * @return the startingLocation
	 */
	public String getStartingLocation() {
		return startingLocation;
	}

	/**
	 * @param startingLocation the startingLocation to set
	 */
	public void setStartingLocation(String startingLocation) {
		this.startingLocation = startingLocation;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the dateOfDeparture
	 */
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	/**
	 * @param dateOfDeparture the dateOfDeparture to set
	 */
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	/**
	 * @return the dateOfArrival
	 */
	public Date getDateOfArrival() {
		return dateOfArrival;
	}

	/**
	 * @param dateOfArrival the dateOfArrival to set
	 */
	public void setDateOfArrival(Date dateOfArrival) {
		this.dateOfArrival = dateOfArrival;
	}
	
}// End class
