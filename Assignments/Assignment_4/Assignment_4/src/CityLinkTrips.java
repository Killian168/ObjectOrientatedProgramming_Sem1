/**
 * Class to get and display all trips from City Link
 * where the parameters passed are input from the user
 * as to where they want to go and when
 */
/**
 * @author Killian O'Daly
 * @version 15 November 2018
 */

import java.util.ArrayList;

public class CityLinkTrips implements OperatorInterface {
		
	/**
	 * Class Constructor:
	 */
	public CityLinkTrips() {}// End Constructor

	
	/* 
	 * Gets all trips from the City Link API that match
	 * the params inputed by the user
	 */
	@Override
	public ArrayList<Trip> getAllTrips( Trip trip ) 
	{
		ArrayList<Trip> trips = new ArrayList<Trip>();

		/*****************************************************
		 * Go to City Link backend API and get the trips here
		 */

		return trips;
		
	}// End getAllTrips
	
	/**
	 * Displays all the trips recieved from City Link
	 */
	public void displayTrips(ArrayList<Trip> trips) 
	{
		for(int i=0; i<trips.size(); i++) {
			System.out.println(trips.get(i));
		}
	}// End displayTrips

	@Override
	public void book( Trip t )
	{
		/*****************************************************
		 * Go to City Link backend API and book the trip here
		 */
	}// End book
	
}// End class CityLink
