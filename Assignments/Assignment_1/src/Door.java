
/*
 * Title: Door
 * Description: The Class for the Door of the car
 */
public class Door {

	// Variables
	private String name; // Holds the name
	private int quantity; // Holds the quantity
	
	/*
	 * Title: Class Constructor
	 * Parameters: String, int
	 * Description: Creates an instance of the class
	 */
	public Door(String drName, int drNum) {
		
		this.name = drName;
		this.quantity = drNum;
		
	}// End Constructor

	/*
	 *  Getters and Setters for Variables
	 */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}// End Class Door
