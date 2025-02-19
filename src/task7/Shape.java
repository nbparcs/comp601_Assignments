package task7;
public class Shape {
	private String colour;
	
	public Shape(String colour) {
        setColour(colour);
    }
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String getShapeType() {
		return "I'm a Shape";
    }
}
