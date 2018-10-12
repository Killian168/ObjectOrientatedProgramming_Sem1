
/*
 * Title: Car
 * Description: The Class for the Car of the car
 */
public class Car {

	// Initializes variables
	private String name; // Holds the name
	private double kmCompleted; // Holds the km completed by the car
	private Engine engine; // Holds the Class engine
	private Door door; // Holds the Class Door
	
	/*
	 * Title: Class Constructor
	 * Parameters:  
	 * 			- String name -> Name of model
	 * 			- String eng -> Name of Engine model
	 * 			- int fuelEff -> Fuel efficiency of the engine
	 * 			- String drName -> Name of Door model
	 * 			- int drNum -> Number of doors
	 * 			- String whNm -> Name of Wheel model
	 * 			- int rad -> Radius of the wheel
	 * 
	 * Description: Creates an instance of class Car
	 */
	public Car(String name, String eng, int fuelEff, String drName, int drNum, String whNm, int rad) 
	{
		// Initalizes variable
		this.name = name;
		this.kmCompleted = 0;
		
		// Creates new instance of Class Engine
		engine = new Engine(eng,fuelEff, whNm, rad);
		
		// Creates new instance of Class Door
		door = new Door(drName, drNum);
	}// End Constructor
	
	/*
	 * Title: drive
	 * Parameters: None
	 * Return: Void
	 * Description: Calculates the total distance covered by the car
	 */
	public void drive() {
		
		// Checks if there is fuel to drive the car
		if(engine.getFuelLevel()<=0) {
		
			//If not print error
			System.out.println("Error 01: No fuel in tank");
		
		}// End if
		else {
			
			// Drives car until tank is empty
			while ((engine.getFuelLevel())>0) {
				
				// Calculates the amount of km driven per liter expended (fuellEff is in Turns per Liter)
				kmCompleted += (engine.getWheel().getCircumference())*(engine.getFuelEff());
				engine.setFuelLevel((engine.getFuelLevel()-1));
				
			}// End while
			
		}// End else
		
	}// End drive

	/*
	 *  Getters and Setters for Variables
	 */
	
	public void setFuel(int fuel) {
		this.engine.setFuelLevel(fuel);
	}// End setFuel
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getKmCompleted() {
		return this.kmCompleted;
	}

	public void setKmCompleted(double kmCompleted) {
		this.kmCompleted = kmCompleted;
	}

	public Engine getEngine() {
		return this.engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Door getDoor() {
		return this.door;
	}

	public void setDoor(Door door) {
		this.door = door;
	}
	
}// End Class Car
