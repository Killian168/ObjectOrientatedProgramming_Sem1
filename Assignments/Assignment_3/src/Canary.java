
/**
 * This is the class that governs all the charictaristics
 * of a Canary, it inherits from the class Bird and Animal
 *
 * @author Killian O'Dálaigh
 * @version (18 October 2018)
 */
public class Canary extends Bird
{
    // instance variables - replace the example below with your own
    String name; // the name of this Canary

    /**
     * Constructor for objects of class Canary
     */
    public Canary(String name)
    {
        super(); // call the constructor of the superclass Bird
        this.name = name;
        colour = "yellow"; // this overrides the value inherited from Bird
        
    }
    
    /**
     * Sing method overrides the sing method
     * inherited from superclass Bird
     */
    @Override // good programming practice to use @Override to denote overridden methods
    public void sing(){
        System.out.println("tweet tweet tweet");
    }
    
    /**
     * toString method returns a String representation of the bird
     * What superclass has Canary inherited this method from? 
     */
    @Override
    public String toString(){
    	
    	// Creates String with all values of Canary
        String strng ="";
        strng+= "Canary; ";
        strng+= "name: ";
        strng+= name;
        strng+= "; ";
        strng+= "colour: ";
        strng+= colour;
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
    }

    
    /**
     * equals method defines how equality is defined between 
     * the instances of the Canary class
     * param Object
     * return true or false depending on whether the input object is 
     * equal to this Canary object
     */
    
    @Override
    public boolean equals(java.lang.Object object){
    	if(object instanceof Canary) {
    		Canary canary = (Canary)object;
        	if ((canary.name.equals(this.name))&&(canary.colour == this.colour)) {
            	return true;
            }
    	}
        return false; //default equals
    }
}
