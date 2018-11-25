/**
 * Main Driver class that ties in all the components together.
 */
/**
 * @author Killian O'Daly
 * @version 15 November 2018
 */
import java.util.ArrayList;

public class DriverClass {
	
	public static void main(String args[]) {

		ArrayList<Trip> beTrips = new ArrayList<Trip>();
		ArrayList<Trip> goTrips = new ArrayList<Trip>();
		ArrayList<Trip> clTrips = new ArrayList<Trip>();
		
		// Get User input for destination, startingLocation
		// dateOfArrival, and dateOfDeparture
		GetInfo getInfo = new GetInfo();
		Trip desiredTrip = new Trip(getInfo.getDestination(), getInfo.getStartingLocation(), getInfo.getDateOfDeparture(), getInfo.getDateOfArrival(), 0);
		
		// Create Trips Classes
		BusEireannTrips BeTrips = new BusEireannTrips();
		GoBusTrips GoTrips = new GoBusTrips();
		CityLinkTrips ClTrips = new CityLinkTrips();
		
		// Get All Trips
		beTrips = BeTrips.getAllTrips( desiredTrip );
		goTrips = GoTrips.getAllTrips( desiredTrip );
		clTrips = ClTrips.getAllTrips( desiredTrip );
		
		// Display All Trips
		BeTrips.displayTrips( beTrips );
		GoTrips.displayTrips( goTrips );
		ClTrips.displayTrips( clTrips );

		/************************************
		 * Here the user will choose one of the operators and we fill in the extra details to the desiredTrip,
		 * i.e. Operator and price. Then we book the trip by calling the book() from the correct operator interface.
		 */
		
		desiredTrip.setOperator(1);
	
		switch(desiredTrip.getOperator())
		{
			case 1:
			BeTrips.book(desiredTrip);
			break;
			
			case 2:
			ClTrips.book(desiredTrip);
			break;
			
			case 3:
			GoTrips.book(desiredTrip);
			break;
			
			default:
				System.out.println("There are no operators matching this");
		}// End switch
		
		
	}// End main
	
}// End DriverClass
