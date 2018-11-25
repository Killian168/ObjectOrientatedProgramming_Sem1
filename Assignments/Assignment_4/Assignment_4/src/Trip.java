/**
 * Class that defines what a trip is
 * and governs what methods a trip can
 * use
 */

/**
 * @author Killian O'Daly
 * @version 15 November 2018
 */

import java.util.Date;
import java.util.UUID;

public class Trip {

	UUID tripId; // Unique Id for each trip
	private String startingLocation;
	private String destination;
	private Date dateOfDeparture;
	private Date dateOfArrival;
	private double price;
	private int operator;
	
	/**
	 * Class Constructor:
	 * @param destination
	 * @param startingLocation
	 * @param dateOfDeparture
	 * @param dateOfArrival
	 * @param price
	 */
	public Trip(String destination, String startingLocation, Date dateOfDeparture, Date dateOfArrival, double price) 
	{
		new UUID(0,0);
		tripId = UUID.randomUUID();
		this.startingLocation = startingLocation;
		this.destination = destination;
		this.dateOfDeparture = dateOfDeparture;
		this.dateOfArrival = dateOfArrival;
		this.price = price;
	}// End constructor
	
	/**
	 * Displays this trip class
	 */
	public void displayTrip() {
		System.out.println(this);
	}// End displayTrip

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Trip [tripId=" + this.tripId + ", startingLocation=" + this.startingLocation + ", destination=" + this.destination
				+ ", dateOfDeparture=" + this.dateOfDeparture + ", dateOfArrival=" + this.dateOfArrival + ", price=" + this.price
				+ ", operator=" + this.operator + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfArrival == null) ? 0 : dateOfArrival.hashCode());
		result = prime * result + ((dateOfDeparture == null) ? 0 : dateOfDeparture.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + operator;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((startingLocation == null) ? 0 : startingLocation.hashCode());
		result = prime * result + ((tripId == null) ? 0 : tripId.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Trip)) {
			return false;
		}
		Trip other = (Trip) obj;
		if (dateOfArrival == null) {
			if (other.dateOfArrival != null) {
				return false;
			}
		} else if (!dateOfArrival.equals(other.dateOfArrival)) {
			return false;
		}
		if (dateOfDeparture == null) {
			if (other.dateOfDeparture != null) {
				return false;
			}
		} else if (!dateOfDeparture.equals(other.dateOfDeparture)) {
			return false;
		}
		if (destination == null) {
			if (other.destination != null) {
				return false;
			}
		} else if (!destination.equals(other.destination)) {
			return false;
		}
		if (operator != other.operator) {
			return false;
		}
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
			return false;
		}
		if (startingLocation == null) {
			if (other.startingLocation != null) {
				return false;
			}
		} else if (!startingLocation.equals(other.startingLocation)) {
			return false;
		}
		if (tripId == null) {
			if (other.tripId != null) {
				return false;
			}
		} else if (!tripId.equals(other.tripId)) {
			return false;
		}
		return true;
	}

	/**
	 * @return the tripId
	 */
	public UUID getTripId() {
		return tripId;
	}

	/**
	 * @param tripId the tripId to set
	 */
	public void setTripId(UUID tripId) {
		this.tripId = tripId;
	}

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

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the operator
	 */
	public int getOperator() {
		return operator;
	}

	/**
	 * @param operator the operator to set
	 */
	public void setOperator(int operator) {
		this.operator = operator;
	}
	
}// End class Trip
