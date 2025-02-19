package task2;
import static java.lang.System.*;
import java.util.Scanner;

public class Assignment2 {
	static Scanner input = new Scanner(in);
	
	public static void main(String[] args) {
		calculateCirlce();
	}
	public static void calculateCirlce() {
	double pi = Math.PI; 
	double radius;

		out.print("Enter circle radius: ");
		radius = Double.parseDouble(input.nextLine());

		String fmt = "%-15s%-15s%-15s\n";
		out.printf(fmt, "Radius", "Perimeter", "Area");
		out.println("-".repeat(45));
		out.printf("%-15.1f%-15.2f%-15.2f", radius, radius*pi*2, radius*radius*pi);
	}	
}
