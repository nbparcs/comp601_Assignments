package question1;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle (double length, double width) {
		 this.setLength(length);
		 this.setWidth(width);
		}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double calcArea() {
		
        return width*length;
    }
}
