/*
 * Description: Class that constructs
 * a rectangle
 * @author: Killian O'Dálaigh
 * @version: 20 November 2018
 */
public class Rectangle extends Shape {

	/**
	 * Class constructor
	 */
	public Rectangle() 
	{
		this.edges = 4;
		this.faces = 1;
		
	}// End constructor

	/* (non-Javadoc)
	 * @see Shape#print()
	 */
	@Override
	public void print(String colour) 
	{
		System.out.println("Drawing Rectangle with colour "+ colour);
	}// End print

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rectangle [edges=" + edges + ", faces=" + faces + ", getEdges()=" + getEdges() + ", getFaces()="
				+ getFaces() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}// End class cube
