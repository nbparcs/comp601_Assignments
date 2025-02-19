package task9;
import static java.lang.System.*;
import java.io.*;
import java.util.*;
import java.nio.file.*;
public class GameApp {
	Scanner input = new Scanner(in);
	private List<Country> countryList;
	public GameApp(String filename) throws IOException{
		countryList = new LinkedList<>();
		readData(filename);
	}
	public void readData(String filename) throws IOException{
		countryList = new LinkedList<>(); 
		Path path = Paths.get(filename);
		List<String> lines = Files.readAllLines(path);
		
		for (String line : lines) {
			String[] items = line.split(",");
			String name = items[0];
			String capital = items[1];
			int population = Integer.parseInt(items[2]);
			Country country = new Country(name, capital, population);
            countryList.add(country);
		}
	}
	//Game starts here - random
	public void game() {
        int triesLeft = 3;
        int lastInt = -1;

        while (true) {
            int randomInt = new Random().ints(0, countryList.size()).findFirst().getAsInt();
            if (randomInt == lastInt) {
                continue;
            }
            lastInt = randomInt;
            Country randomCountry = countryList.get(randomInt);
            String capitalAns = randomCountry.getCapital();
            String countryName = randomCountry.getName();

            while (triesLeft > 0) {
                out.print("What is the capital of " + countryName + "?: ");
                String resp = input.nextLine();
                if (resp.equalsIgnoreCase(capitalAns)) {
                    out.println("Well done! \n" + countryName + " is a country of " + randomCountry.getPopulation() + " million " + "population." );
                    break;
                } else if (triesLeft == 1) {
                    out.println("Incorrect. It's " + capitalAns);
                } else {
                    out.println("Incorrect, try again! (" + (triesLeft - 1) + " tries remaining)");
                }
                triesLeft--;
            }

            out.print("Play again? (y/n): ");
            String userContinue = input.nextLine();
            if (!userContinue.equalsIgnoreCase("y")) {
                break;
            }
            triesLeft = 3; // Reset tries for the next game
        }
    }
}