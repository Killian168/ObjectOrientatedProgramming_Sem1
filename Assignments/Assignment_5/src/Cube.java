/*
 * Description: Class that constructs
 * a cube
 * @author: Killian O'Dálaigh
 * @version: 20 November 2018
 */
public class Cube extends Shape {

	/**
	 * Class constructor
	 */
	public Cube() 
	{
		this.edges = 19;
		this.faces = 6;
		
	}// End constructor

	/* (non-Javadoc)
	 * @see Shape#print()
	 */
	@Override
	public void print(String colour) 
	{
		System.out.println("Drawing Cube with colour "+ colour);
	}// End print

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cube [edges=" + edges + ", faces=" + faces + ", getEdges()=" + getEdges() + ", getFaces()=" + getFaces()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}// End class cube
