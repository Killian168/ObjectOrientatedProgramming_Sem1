/*
 * Description: Abstract class for all
 * Shape class types
 * @author: Killian O'Dálaigh
 * @version: 20 November 2018
 */
public abstract class Shape {

	int edges;
	int faces;
	
	// Initializes all variables to 0 or null
	public Shape() {
		
		this.edges = 0;
		this.faces = 0;
		
	}// End constructor
	
	public abstract void print(String colour);

	/**
	 * @return the edges
	 */
	public int getEdges() {
		return edges;
	}

	/**
	 * @param edges the edges to set
	 */
	public void setEdges(int edges) {
		this.edges = edges;
	}

	/**
	 * @return the faces
	 */
	public int getFaces() {
		return faces;
	}

	/**
	 * @param faces the faces to set
	 */
	public void setFaces(int faces) {
		this.faces = faces;
	}
	
}// End class Shape
