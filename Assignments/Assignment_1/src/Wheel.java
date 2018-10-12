
/*
 * Title: Wheel
 * Description: The Class for the Wheel of the car
 */
public class Wheel {

	// Variables
	private int radius; // holds the radius of the wheel
	private String name; // holds the name of the wheel
	private double circumference; // holds the circumference
	
	/*
	 * Title: Class Constructor
	 * Parameters: String, int
	 * Description: Creates an instance of class Wheel
	 */
	public Wheel(String name, int radius) {
		
		// Initializes variables
		this.name = name;
		this.radius = radius;
		this.circumference = (2*Math.PI*this.radius);
		
	}// End Constructor
	
	/*
	 *  Getters and Setters for Variables
	 */
	
	public double getCircumference() {
		return circumference;
	}// End getDistance

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}
	
}// End Class Wheel
