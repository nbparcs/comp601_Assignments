package task3;
import static java.lang.System.*;
import java.util.*;

public class Assignment3 {
	static Scanner input = new Scanner(in);
	public static void main(String[] args) {
		getScore();
	}

	public static void getScore() 
	{
		double score;
		String grade = "";	

		while(true) 
		{
			out.printf("Enter a score: ");
			score = Double.parseDouble(input.nextLine());
			if(score >= 0 && score <= 100)
				break;			
			else 
				out.println("Invalid");			
		}
		
			if(score >= 0 && score <= 49) {
				grade = "D";
			}
			else if(score >= 50 && score <= 69) {
				grade = "C";
			}
			else if(score >= 70 && score <= 79) {
				grade = "B";
			}
			else if(score >= 80 && score <= 100) {
				grade = "A";
			}
			
		out.printf("Score %.1f", score);
		out.printf(" will receive %s", grade);
	}
}

