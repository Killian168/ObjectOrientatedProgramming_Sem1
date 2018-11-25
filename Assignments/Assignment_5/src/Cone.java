/*
 * Description: Class that constructs
 * a rectangle
 * @author: Killian O'Dálaigh
 * @version: 20 November 2018
 */
public class Cone extends Shape {

	/**
	 * Class constructor
	 */
	public Cone() 
	{
		this.edges = 1;
		this.faces = 2;
		
	}// End constructor

	/* (non-Javadoc)
	 * @see Shape#print()
	 */
	@Override
	public void print(String colour) 
	{
		System.out.println("Drawing Cone with colour "+ colour);
	}// End print

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cone [edges=" + edges + ", faces=" + faces + ", getEdges()=" + getEdges() + ", getFaces()=" + getFaces()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}// End class cube
