package question2;
import static java.lang.System.*;
import java.util.*;
import java.io.*; //gives io exception class
import java.nio.file.*;

public class TeamApp {
	Scanner input = new Scanner(in);
	private List<Team> teams;
	public List<Team> getTeamList() {     
		return teams;   
	} 
	
    public TeamApp(String filename) throws IOException {
        teams = new LinkedList<Team>();
        readTeamData(filename);
    }

    public void readTeamData(String filename) throws IOException {
    	teams = new LinkedList<>();
    	Path path = Paths.get(filename);
    	List<String> lines = Files.readAllLines(path);
    	
    	for(String line : lines) {
    		String[] items = line.split(",");
    		String name = items[0];
    		int groupSize = Integer.parseInt(items[1]);
    		String ID = items[2];
    		double score = Double.parseDouble(items[3]);
    		Team team = new Team(name, groupSize, ID, score);
    		teams.add(team);
    	}
    }

    public int countTeams() {
    	double score = 0; 
    	int count = 0;
    	if(teams != null && teams.size() > 0)
    		for (Team t : teams) {
    			score = t.getScore();
    			if (score >= 50 && score <= 90)
    				count++;
    		}
    	return count;
    }

    public void searchTeam() {
    	if (teams == null || teams.size() == 0) {
    		return;
    	}
    	out.print("Enter team ID: ");
    	String id = input.nextLine();
    	Team team = null;
    	for(Team t : teams) {
    		if(t.getID().equalsIgnoreCase(id)) {
    			team = t;
    			break;
    		}
    	}
    }

    //public double getAverageScore() {
    	

    //}
}
