package task5;

import static java.lang.System.out;

public class Note {
	private String pitch;
	private int duration;
	public Note(String pitch, int duration) {
		this.setPitch(pitch);
		this.setDuration(duration);
	}
	
	public void playNote() {
		out.printf("The note %s is played for %d seconds\n", pitch, duration);
	} 
	public String getPitch() {
		return pitch;
	}
	public void setPitch(String pitch) {
		this.pitch = pitch;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
}
