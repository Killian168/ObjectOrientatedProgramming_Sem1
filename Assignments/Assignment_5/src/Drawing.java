import java.util.ArrayList;

public class Drawing {
	
	private ArrayList<Shape> shapes;
	private String colour;
	private ArrayList<String> validColours;
	
	public Drawing() {
		validColours = new ArrayList<String>();
		validColours.add("Black");
		validColours.add("black");
		validColours.add("Red");
		validColours.add("red");
		validColours.add("Blue");
		validColours.add("blue");
		this.colour = "Black";
		this.shapes = new ArrayList<Shape>();
	}// End constructor
	
	// Add a shape to the drawing
	public void add(Shape shape) {
		this.shapes.add(shape);
	}
	
	// Prints out drawing
	public void print() {
		for(Shape shape : shapes) {
			shape.print(this.colour);
		}
	}
	
	// Remove a shape to the drawing
	public void remove(Shape shape) {
		if(this.shapes.contains(shape))
		{
			this.shapes.remove(this.shapes.indexOf(shape));
		}
		else
		{
			System.out.println("\nERROR 01: Shape is not in this drawing");
		}
	}
	
	public void add(Drawing drawing) {
		for(int i=0; i<drawing.shapes.size(); i++) {
			this.add(drawing.getShapes().get(i));
		}
	}
	
	public void remove(Drawing drawing) {
		for(int i=0; i<drawing.shapes.size(); i++) {
			this.remove(drawing.getShapes().get(i));
		}
	}

	/**
	 * @return the shapes
	 */
	public ArrayList<Shape> getShapes() {
		return shapes;
	}

	/**
	 * @param shapes the shapes to set
	 */
	public void setShapes(ArrayList<Shape> shapes) {
		this.shapes = shapes;
	}

	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) throws IllegalArgumentException {
		if(this.validColours.contains(colour))
		{
			this.colour = colour;
		}
		else {
			throw new IllegalArgumentException("\nERROR 02: This is not a valid colour\n must be Black, Blue, or Red");
		}
	}

}// End class Drawing
