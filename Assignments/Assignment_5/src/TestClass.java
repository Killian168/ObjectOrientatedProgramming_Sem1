/*
 * Description: Main test class for program
 * @author: Killian O'Dálaigh
 * @version: 20 November 2018
 */
public class TestClass {

	/*
	 * Main starter method of program
	 */
	public static void main(String args[]) {
		
		// Creates 4 shapes
		Shape cube1 = new Cube();
		Shape rectangle1 = new Rectangle();
		Shape cone1 = new Cone();
		Shape rectangle2 = new Rectangle();
		
		// Creates 3 drawings
		Drawing drawing1 = new Drawing();
		Drawing drawing2 = new Drawing();
		Drawing drawing3 = new Drawing();
		
		// Adds shapes to drawings
		drawing3.add(cube1);
		drawing2.add(rectangle1);
		drawing2.add(rectangle2);
		drawing1.add(cone1);
		
		// Adds drawings to drawings
		drawing1.add(drawing3);
		drawing1.add(drawing2);
		
		// Sets colours for drawings
		try{
			drawing1.setColour("Black");
		}
		catch(IllegalArgumentException inc) {
			System.out.println(inc.getMessage());
		}
		
		try {
			drawing2.setColour("Black");
		}
		catch(IllegalArgumentException inc) {
			System.out.println(inc.getMessage());
		}
		
		// Print drawing
		drawing2.print();
		
		// Remove shape
		drawing2.remove(rectangle1);
		
		// Print drawings
		drawing2.print();
		drawing3.print();
		
		// Set drawing colour
		try {
			drawing3.setColour("Red");
		}
		catch(IllegalArgumentException inc) {
			System.out.println(inc.getMessage());
		}
		
		// Print drawing again
		drawing3.print();
		
		// Set drawing colour
		try {
			drawing1.setColour("bleu");
		}
		catch(IllegalArgumentException inc) {
			System.out.println(inc.getMessage());
		}		
		
		
	}// End Main
	
}// End class TestClass
