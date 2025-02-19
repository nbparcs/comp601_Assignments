package task6;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		List<LeafyGreen> veges = new LinkedList<>();  
		veges.add(new LeafyGreen(10, 3.5, "Cabbage"));   
		veges.add(new LeafyGreen(5, 2.94, "Lettuce"));   
		veges.add(new LeafyGreen(20, 5.45, "Broccoli"));   
		veges.add(new LeafyGreen(7, 1.94, "Lettuce"));   
		veges.add(new LeafyGreen(15, 2.8, "Lettuce"));   
		veges.add(new LeafyGreen(30, 2.5, "Cabbage"));   
		veges.add(new LeafyGreen(28, 4.4, "Broccoli"));   
		veges.add(new LeafyGreen(20, 5.5, "Cabbage")); 
		veges.add(new LeafyGreen(16, 3.9, "Broccoli"));      
		veges.add(new LeafyGreen(26, 4.8, "Broccoli"));              
			
		calculateStats(veges);  
	}
	 public static void calculateStats(List<LeafyGreen> veges){                
		 	double totalPrice = 0;
	        for (LeafyGreen leafyGreen : veges) {
	            totalPrice += leafyGreen.getWeight() * leafyGreen.getPrice();
	        }
	        System.out.println("Total vegetable cost $" + totalPrice);
	        double cabbageWeight = 0;
	        double broccoliWeight = 0;
	        double lettuceWeight = 0;
	        double totalWeight;

	        for (LeafyGreen leafyGreen : veges) {
	            if (leafyGreen.getTypes().equals("Cabbage")) {
	                cabbageWeight += leafyGreen.getWeight();
	            } else if (leafyGreen.getTypes().equals("Broccoli")) {
	                broccoliWeight += leafyGreen.getWeight();
	            } else if (leafyGreen.getTypes().equals("Lettuce")) {
	                lettuceWeight += leafyGreen.getWeight();
	            }
	        }
	        totalWeight = cabbageWeight + broccoliWeight + lettuceWeight;
	        System.out.println("Total vegetables weight: " + totalWeight + " kg");
	        System.out.println("Total Cabbage weight: " + cabbageWeight + " kg");
	        System.out.println("Total Broccoli weight: " + broccoliWeight + " kg");
	        System.out.println("Total Lettuce weight: " + lettuceWeight + " kg");
	}
}