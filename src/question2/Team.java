package question2;

public class Team extends Group {
	private String ID;
	private double score;
	
	public Team(String name, int groupSize, String ID, double score) {
		super(name, groupSize);
		this.setGroupSize(groupSize);
		this.setID(ID);
		this.setScore(score);
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
}
