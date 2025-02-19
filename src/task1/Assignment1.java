package task1;

import static java.lang.System.out;

public class Assignment1 {

	public static void main(String[] args) {
		String fmt = "%-20s%-30s\n";
		out.printf(fmt, "Escape Sequence", "Description");
		out.println("-".repeat(45));
		out.printf(fmt, "\\n", "New line character");
		out.printf(fmt, "\\t", "Horizontal tab character");
		out.printf(fmt, "\\\"", "Double quote character");
		out.printf(fmt, "\\b", "Backspace character");
	}
}
