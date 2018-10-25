/**
 * This is the class that governs all the charictaristics
 * of a Fish, it inherits from the class Animal
 *
 * @author Killian O'Dálaigh
 * @version (18 October 2018)
 */
public abstract class Fish extends Animal 
{

	boolean hasFins;
	boolean canSwim;
	boolean hasGills;
	
	public Fish() 
	{
		super();
		this.hasFins = true;
		this.canSwim = true;
		this.hasGills = true;
	}// End Constructor
	
	/*
	 ************************************* Methods **************************************
	 */
	
	// Makes the bird swim
	public void swim(int distance) 
	{
			
		// If this bird can swim
		if(this.canSwim) 
		{
				
			// Swim
			System.out.printf("You swam %d", distance);
		}
		else 
		{
				
			// Bird can't swim
			System.out.println("You can't swim!!");
		}
			
	}// End swim()
	
	/*
	 ************************************* Getters and Setters **************************************
	 */
	public boolean isHasFins() {
		return hasFins;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	public boolean isHasGills() {
		return hasGills;
	}
	
	
}// End Constructor
