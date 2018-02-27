package ex5;

public class InvalidHoursException extends Exception {
	public InvalidHoursException() {
		super("Hours worked cannot be negative or above 84");
	}
}
