package task10;
import static java.lang.System.*;
import java.util.*;

import java.io.*;
import java.nio.file.*;
public class AudioBookApp {
	 private List<AudioBook> bookList;
	 public List<AudioBook> getBookList() {     
		 return bookList;   
		 }   
	 
	 public AudioBookApp(String filename) throws IOException {      
		 bookList = new LinkedList<>();      
		 readData(filename);   
		 }   
	 
	 public void readData(String filename) throws IOException {            
		 	bookList = new LinkedList<>(); 
			Path path = Paths.get(filename);
			List<String> lines = Files.readAllLines(path);

			for (String line : lines) {
				String[] items = line.split(",");
				String name = items[0];
				int year = Integer.parseInt(items[1]);
				double length = Double.parseDouble(items[2]);
				AudioBook booklist = new AudioBook(name, year, length);
				bookList.add(booklist);
			} 
		 } 
	 
	 public List<AudioBook> getShortestBooks(){
		 List <AudioBook> shortest =  new LinkedList<>();
		 if (bookList != null && bookList.size() > 0) {
			 double length = bookList.get(0).getLength();
			 for (AudioBook book : bookList) {
				 if (book.getLength() < length)
					 length = book.getLength();
			 }
			 for (AudioBook book : bookList) {
				 if(book.getLength() == length)
					 shortest.add(book);
			 }
		 }
		 return shortest;
	 }
	 
	 public int countBooks()  {             
		 int year = 0, count = 0;
		 if (bookList != null && bookList.size() > 0) 
		 for (Book b : bookList){
			 year = b.getYear();
			 if (year >= 2010 && year <= 2020)
				 count++;
		 }
		 return count;
	 }   
	 
	 public void randomBookList()  {             
		 List<AudioBook> b1 = new LinkedList<>();
		 List<AudioBook> b2 = new LinkedList<>();
		 List<AudioBook> b3 = new LinkedList<>();
		 Random rand = new Random();

		    for (AudioBook b : bookList) {
		    	int r = rand.nextInt(7) + 1;

		        switch (r) {
		            case 1:
		                b1.add(b);
		                break;
		            case 2:
		                b2.add(b);
		                break;
		            case 3:
		                b3.add(b);
		                break;
		        }
		    }
		    out.println("\nRandom Book List: ");
		    out.println("-".repeat(57));
		    out.println(b1.size() + " Books in List #1: ");
		    for (AudioBook b : b1) {
		        out.printf("%-30s%-20s%-20s\n", b.getName(), b.getYear(), b.getLength());
		    }
		    
		    out.println("\n" + b2.size() + " Books in List #2: ");
		    for (AudioBook b : b2) {
		        out.printf("%-30s%-20s%-20s\n", b.getName(), b.getYear(), b.getLength());
		    }

		    out.println("\n" + b3.size() + " Books in List #3: ");
		    for (AudioBook b : b3) {
		        out.printf("%-30s%-20s%-20s\n", b.getName(), b.getYear(), b.getLength());
		        
		    }
	 }
	 
}
