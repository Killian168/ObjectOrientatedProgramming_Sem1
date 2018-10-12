/*
 * Title: Assignment 1
 * Description: Creates a car with variable parts and calculates the range of this car
 * Author: Killian O'Dálaigh, Paul Kirwan
 * Student Num: 18101573, 17321313
 */

/*
 * Title: Main
 * Description: Running Class
 */
public class Main {
	
	/*
	 * Title: main
	 * Parameters: String args
	 * Return: Void
	 * Description: Running method
	 */
	public static void main(String[] args) {
		
		// Creates a new instance of obj Car
		Car car = new Car("Mark7", "PL9", 9, "UP2", 2, "Wichelin8", 8);
		
		// Sets fuel to 50
		car.setFuel(25);
		
		// Calculates the distance covered
		car.drive();
		
		// Prints out the total Km's covered
		System.out.println("Kilometers Completed = " + car.getKmCompleted() + "Km");
		
	}// End main

}// End Class Main
