package task5;
import static java.lang.System.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        List<Note> notes = new LinkedList<>();
        notes.add(new Note("D", 19));
        notes.add(new Note("C", 20));
        notes.add(new Note("F", 31));
        notes.add(new Note("B", 45));
        notes.add(new Note("C", 73));
        notes.add(new Note("F", 13));
        notes.add(new Note("B", 34));
        notes.add(new Note("C", 53));
		
		 processNotes(notes);	
	}
	public static void processNotes(List<Note> notes) {
        int totalDuration = 0;
        
        for (Note note : notes) {
            note.playNote(); 
            totalDuration += note.getDuration(); 
        }
        
        out.println("Total Duration: " + totalDuration);
    }
}
