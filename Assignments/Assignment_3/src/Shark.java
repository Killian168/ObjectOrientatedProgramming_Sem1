/**
 * This is the class that governs all the charictaristics
 * of a Shark, it inherits from the class Animal and Fish
 *
 * @author Killian O'Dálaigh
 * @version (18 October 2018)
 */
public class Shark extends Fish 
{

	boolean canBite;
	boolean isDangerous;
	
	// Constructor for this class
	// Initializes all the variables
	public Shark() 
	{
		super();
		this.canBite = true;
		this.isDangerous = true;
	}// End Constructor
	
	/*
	 ************************************* Methods **************************************
	 */
	
	/**
     * toString method returns a String representation of the bird
     */
    @Override
    public String toString()
    {
    	
    	// Creates String with all values of Salmon
        String strng ="";
        strng+= "Shark; ";
        strng+= "isDangerous: ";
        strng+= this.isDangerous;
        strng+= "; ";
        strng+= "CanBite: ";
        strng+= this.canBite;
        strng+= "\n";
        
        // Adds all values if Bird
        strng += "Bird;";
        strng += "Feathers:";
        strng += this.hasFins;
        strng+= "; ";
        strng += "Wings";
        strng += this.canSwim;
        strng+= "; ";
        strng += "Flies";
        strng += this.hasGills;
        strng += "\n";
        
        // Adds all values of Animal
        strng += "Animal";
        strng += "hasSkin:";
        strng += this.hasSkin;
        strng+= "; ";
        strng += "Breathes";
        strng += this.breathes;
        
        return strng;
    }// End toString method

    
    /**
     * equals method defines how equality is defined between 
     * the instances of the Canary class
     * param Object
     * return true or false depending on whether the input object is 
     * equal to this Canary object
     */
    
    @Override
    public boolean equals(java.lang.Object object)
    {
    	if(object instanceof Shark) 
    	{
    		Shark shark = (Shark)object;
        	if ((shark.isDangerous==this.isDangerous)&&(shark.canBite==this.canBite)) 
        	{
            	return true;
            }
    	}
        return false; //default equals
    }// End equals()
  
    /*
     ******************************* Getters and Setters ************************   
     */
    
    public boolean isCanBite() {
		return canBite;
	}

	public boolean isDangerous() {
		return isDangerous;
	}
    
	
}// End class Shark
