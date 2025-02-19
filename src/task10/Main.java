package task10;
import static java.lang.System.*;
import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String txtfile = "data/bookdata.txt"; 
		try {    
			AudioBookApp app = new AudioBookApp(txtfile);

			out.println("Shortest books:");
			displayBooks(app.getShortestBooks());
			out.printf("\nBooks published btw 2010-2020: %d\n", 	
			app.countBooks());
			app.randomBookList();             
			app.readData(txtfile);
			app.countBooks();
			
			
		}catch(IOException ioe) 
		{        
				out.printf("Perhaps missing text file: %s/%s? \n",           
				new Main().getClass().getPackage().getName(), txtfile);     
		}
	}
	
	public static void displayBooks(List<AudioBook> list){
		if (list != null && list.size() > 0) {
			for(AudioBook b : list) {
				out.printf("%-30s%-20d%-20.2f\n", b.getName(), b.getYear(), b.getLength());
			}
		}else {
	        out.println("The list is empty."); // Add a message if the list is empty
	    }
	}
}
