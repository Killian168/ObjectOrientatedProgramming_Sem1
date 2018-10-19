/**
 * This is the class that governs all the charictaristics
 * of a Trout, it inherits from the class Animal and Fish
 *
 * @author Killian O'Dálaigh
 * @version (18 October 2018)
 */
public class Trout extends Fish {

	String birthProcess;
	boolean edible;
	boolean hasSpikes;

	public Trout() {
		super();
		this.hasSpikes = true;
		this.colour = "Pink";
		this.edible = true;
		this.birthProcess = "Swims upstream to Lay Eggs";
	}// End Constructor

	/*
	 ************************************* Methods **************************************
	 */

	/**
	 * toString method returns a String representation of the bird What superclass
	 * has Canary inherited this method from?
	 */
	@Override
	public String toString() 
	{

		// Creates String with all values of Trout
		String strng = "";
		strng += "Canary; ";
		strng += "colour: ";
		strng += this.colour;
		strng += "; ";
		strng += "edible: ";
		strng += this.edible;
		strng += "; ";
		strng += "birthProcess: ";
		strng += this.birthProcess;
		strng += "\n";

		// Adds all values if Bird
		strng += "Bird;";
		strng += "Feathers:";
		strng += this.hasFins;
		strng += "; ";
		strng += "Wings";
		strng += this.canSwim;
		strng += "; ";
		strng += "Flies";
		strng += this.hasGills;
		strng += "\n";

		// Adds all values of Animal
		strng += "Animal";
		strng += "hasSkin:";
		strng += this.hasSkin;
		strng += "; ";
		strng += "Breathes";
		strng += this.breathes;

		return strng;
	}// End toString

	/**
	 * equals method defines how equality is defined between the instances of the
	 * Canary class param Object return true or false depending on whether the input
	 * object is equal to this Canary object
	 */

	@Override
	public boolean equals(java.lang.Object object) 
	{
		if(object instanceof Trout) 
		{
			Trout salmon = (Trout) object;
			if ((salmon.colour.equals(this.colour))&&(salmon.edible == this.edible)&&(salmon.birthProcess.equals(this.birthProcess))&&(salmon.hasSpikes==this.hasSpikes)) 
			{
				return true;
			}
		}
		return false; // default equals
	}// End equals

	/*
	 ************************************* Getters and Setters **************************************
	 */

	public String getBirthProcess() {
		return birthProcess;
	}

	public boolean isEdible() {
		return edible;
	}

}// End class Trout
