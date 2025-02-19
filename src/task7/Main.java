package task7;
import java.util.List;

import static java.lang.System.out;

import java.util.LinkedList;
public class Main {
	
	public static void main(String[] args) {              
		List<Shape> shapes = new LinkedList<>();
		out.println( "Sample run output part 1: \n");
		shapes.add(new Shape("white"));             
		shapes.add(new Rectangle("red", 10, 6));             
		shapes.add(new Rectangle("black", 20, 9));             
		shapes.add(new Shape("orange"));              
		showShapeNames(shapes);
		
		Rectangle[] rectangleArray1 = {                                    
				new Rectangle("white", 4, 3),                                    
				new Rectangle("red", 9, 5),                                    
				new Rectangle("purple", 3, 6),                                    
				new Rectangle("orange", 15, 10),                                    
				new Rectangle("black", 4, 14),                                
		};      
		
		Rectangle[] rectangleArray2 = {                                    
				new Rectangle("pink", 3, 4),                                    
				new Rectangle("red", 10, 2),                                    
				new Rectangle("white", 8, 5),                                    
				new Rectangle("blue", 14, 4),                                    
				new Rectangle("bindle", 10, 15),                                
		};
		countOverlapRectangles(rectangleArray1, rectangleArray2);
	}
	
	public static void showShapeNames(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.getShapeType());
        }
    }
    public static void  countOverlapRectangles(Rectangle[] set1, Rectangle[] set2) {
        int colourOverlap = 0;
        int perimeterOverlap = 0;
        for (Rectangle r1 : set1) {
            for (Rectangle r2 : set2) {
                if (r1.getColour() == r2.getColour()) {
                    colourOverlap++;
                }
                if (r1.getPerimeter() == r2.getPerimeter()) {
                    perimeterOverlap++;
                }
            }
        }
        out.println("\nSample run output part 2: \n");
        System.out.println("There are " + colourOverlap + " Rectangle objects with overlapping colours between the two arrays.");
        System.out.println("There are " + perimeterOverlap + " Rectangle objects with overlapping perimeter between the two arrays.");

    }
}
