/**
 * Interface for any class that deals with
 * trip operators
 */

/**
 * @author Killian
 * @version 15 November 2018
 */

import java.util.ArrayList;

public interface OperatorInterface {

	public ArrayList<Trip> getAllTrips( Trip trip );
	public void displayTrips(ArrayList<Trip> trips);
	public void book( Trip trip );
	
}// End AllTrips interface
