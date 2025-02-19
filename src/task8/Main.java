package task8;
import static java.lang.System.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		 List<Bag> bags = new LinkedList<>();
		 bags.add(new Bag("bag1", 4.3));
	     bags.add(new Bag("bag2", 2.3));
	     bags.add(new Bag("bag3", 6.3));
	     
		 BagApp bgapp = new BagApp();            
		 double totalCapacity = bgapp.calcTotalCapacity(bags);
	     out.printf("Total capacity: %.2f\n", totalCapacity);
	     out.printf("Total number of bags: %d\n", bags.size());
		 } 
}
