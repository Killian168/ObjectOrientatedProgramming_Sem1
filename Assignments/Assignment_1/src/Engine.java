
/*
 * Title: Engine
 * Description: The Class for the Engine of the car
 */
public class Engine {

	private double fuelLevel; // Holds the fuel level
	private String name; // Holds the name of the engine
	private double fuelEff; // Turns per Litre
	private Wheel wheel; // Holds the wheel class
	
	/*
	 * Title: Class Constructor
	 * Parameters: String, int
	 * Description: Creates an instance of class Engine
	 */
	public Engine(String name, int fuelEff, String whName, int rad) {
		
		// Initializes variables
		this.fuelEff = fuelEff;
		this.name = name;
		this.fuelLevel = 0;
		
		// Creates new instance of type Wheel
		wheel = new Wheel(whName, rad);
		
	}// End Constructor
	
	/*
	 *  Getters and Setters for Variables
	 */
	
	public double getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(double fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFuelEff() {
		return fuelEff;
	}

	public void setFuelEff(double fuelEff) {
		this.fuelEff = fuelEff;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	
}// End Class Engine
