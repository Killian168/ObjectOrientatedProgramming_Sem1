/**
 * This is the class that governs all the charictaristics
 * of a Ostrich, it inherits from the class Bird and Animal
 *
 * @author Killian O'Dálaigh
 * @version (18 October 2018)
 */
public class Ostrich extends Bird 
{
	
	String legs;
	String height;
	
	public Ostrich() 
	{
		this.legs = "Long thin legs";
		this.height = "tall";
		this.flies = false;
		this.colour = "grey";
	}// End Constructor
	
	/*
	 ************************************* Methods **************************************
	 */
	
	/**
     * toString method returns a String representation of the bird
     * What superclass has Canary inherited this method from? 
     */
    @Override
    public String toString()
    {
    	
    	// Creates String with all values of Canary
        String strng ="";
        strng+= "Ostrich; ";
        strng+= "legs: ";
        strng+= this.legs;
        strng+= "; ";
        strng+= "height: ";
        strng+= this.height;
        strng+= "\n";
        
        // Adds all values if Bird
        strng += "Bird;";
        strng += "Feathers:";
        strng += this.hasFeathers;
        strng+= "; ";
        strng += "Wings";
        strng += this.hasWings;
        strng+= "; ";
        strng += "Flies";
        strng += this.flies;
        strng += "\n";
        
        // Adds all values of Animal
        strng += "Animal";
        strng += "hasSkin:";
        strng += this.hasSkin;
        strng+= "; ";
        strng += "Breathes";
        strng += this.breathes;
        
        return strng;
    }// End toString()

    
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
        if(object instanceof Ostrich) 
        {
        	Ostrich ostrich = (Ostrich)object;
        	if ((ostrich.height.equals(this.height))&&((ostrich.legs.equals(this.legs)))&&(ostrich.flies==this.flies)&&(ostrich.colour==this.colour)) 
        	{
            	return true;
            }
        }
        return false; //default equals
    }// End equals
	
}// End class Ostrich
