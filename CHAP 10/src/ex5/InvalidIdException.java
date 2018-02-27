package ex5;

public class InvalidIdException extends Exception {
	public InvalidIdException() {
		super("Invalid ID entered");
	}
}
