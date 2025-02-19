package task4;
import static java.lang.System.*;
import java.util.*;
public class Assignment4{
		
	public static void main(String[] args) {
		splitUserInput();
	}
	public static void splitUserInput() {
		List<String> colors = new LinkedList<>();
		String colorsSet1;
		String colorsSet2;
		Scanner input = new Scanner(System.in);
		
		
		out.print("Enter first line of colours separated by comma: ");
		colorsSet1 = input.nextLine();
		out.print("Enter second line of colours separated by comma: ");
		colorsSet2 = input.nextLine();
			
		String[] countcolorsSet1 = colorsSet1.split(",");
		out.printf("You entered %d colours in the first list\n", countcolorsSet1.length);
		
		String[] countcolorsSet2 = colorsSet2.split(",");
		out.printf("You entered %d colours in the second list\n", countcolorsSet2.length);
		input.close();
		
		int count = 0;
		for (String c1 : countcolorsSet1) {
		    for (String c2 : countcolorsSet2) {
		      if (c1.equalsIgnoreCase(c2)) {
		           count++;
		           colors.add(c1);	
		      }
		   }
		}
		out.println("Number of overlapping colors:" + count);
		out.println("Overlapping colours are as follows:");
		for(String c : colors) {
			out.println(c);
		}
	}
}