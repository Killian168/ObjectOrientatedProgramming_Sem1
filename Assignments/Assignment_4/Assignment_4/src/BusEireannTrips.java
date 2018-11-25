/**
 * Class to get and display all trips from Bus Eireann
 * where the parameters passed are input from the user
 * as to where they want to go and when
 */
/**
 * @author Killian O'Daly
 * @version 16 November 2018
 */

import java.util.ArrayList;

public class BusEireannTrips implements OperatorInterface {
	
	/**
	 * Class Constructor:
	 */
	public BusEireannTrips() {}// End Constructor

	/* 
	 * Gets all trips from the Bus Eireann API that match
	 * the params inputed by the user
	 */
	@Override
	public ArrayList<Trip> getAllTrips( Trip trip ) 
	{
		ArrayList<Trip> trips = new ArrayList<Trip>();

		/*****************************************************
		 * Go to BusEireann backend API and get the trips here
		 */

		return trips;
		
	}// End getAllTrips
	
	/**
	 * Displays all the trips received from Bus Eireann
	 */
	public void displayTrips(ArrayList<Trip> trips) 
	{
		for(int i=0; i<trips.size(); i++) {
			System.out.println(trips.get(i));
		}
	}// End displayTrips

	@Override
	public void book( Trip trip )
	{
		/*****************************************************
		 * Go to BusEireann backend API and book the trip here
		 */
	}// End book
	
}// End class BusEireann
