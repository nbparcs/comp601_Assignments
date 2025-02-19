package task10;
import static java.lang.System.*;
public class AudioBook extends Book {
	private double length;
	
	public AudioBook (String name, int year, double length) {
		super(name, year);
		this.setLength(length);
		//this.setYear(year);
	}
	public void displayInfo() {
        out.printf("%-20s %s  \n", "Length", getLength());
        out.printf("%-20s %.2f\n", "Name", getName());
        out.printf("%-20s %.d \n", "Year", getYear());
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

}
