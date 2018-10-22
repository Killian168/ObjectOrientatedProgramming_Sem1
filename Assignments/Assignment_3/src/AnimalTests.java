/**
 * These are all the tests run for this piece if code
 *
 * @author Killian O'Dálaigh
 * @version (18 October 2018)
 */
public class AnimalTests 
{

	// First Method to run in program
	public static void main(String[] args) 
	{
		
		// Tests the toString methods that have been overridden in each class
		toStringTest();
		
		// Tests the equals methods that have been overridden in each class
		equalsTest();

	}// End main()
	
	// Tests all the toString methods of each class
	private static void toStringTest() 
	{
		
		System.out.println("************************* ToStringTest ************************************");
		
		// Creates an array that holds one of each animal
		Animal[] animals1 = new Animal[4];
		animals1[0] = new Ostrich();
		animals1[1] = new Canary("Larry");
		animals1[2] = new Trout();
		animals1[3] = new Shark();
		
		// Uses the toString Method in each class to print out its status
		for(int i=0; i<4; i++) 
		{
			System.out.println("\n\n"+animals1[i]);
		}
		
		System.out.println("************************* End ToStringTest **********************************");
		
	}// End toStringTest()

	private static void equalsTest() 
	{
		
		System.out.println("************************* EqualsTest ************************************");
		
		// Creates an array of standard object
		Animal[] animals1 = new Animal[4];
		animals1[0] = new Ostrich();
		animals1[1] = new Canary("Larry");
		animals1[2] = new Trout();
		animals1[3] = new Shark();
		
		// Creates another array of objects to be compared against the first
		Animal[] animals2 = new Animal[4];
		animals2[0] = new Ostrich();
		animals2[1] = new Canary("Larry");
		animals2[2] = new Trout();
		animals2[3] = new Shark();
		
		// Checks if elements that should be the same are the same
		for(int i=0; i<4; i++) {
			if(animals1[i].equals(animals2[i])) {
				System.out.println("They are a match");
			}
			else {
				System.out.println("They weren't a match");
			}
		}
		
		// Checks if elements that should be different are different except for the one correct comparison
		// Runs through the first array
		for(int i=0; i<4; i++) 
		{
			
			// More legible
			System.out.println("\n");
			
			// Runs through the second array
			for(int j=0; j<4; j++) 
			{
				if(animals1[i].equals(animals2[j])) 
				{
					System.out.println("They are a match");
				}
				else 
				{
					System.out.println("They weren't a match");
				}
			}// End for(j)
		}// End for(i)
		
		System.out.println("************************* End EqualsTest ************************************");
		
	}// End equalsTest

}// End class AnimalTests
