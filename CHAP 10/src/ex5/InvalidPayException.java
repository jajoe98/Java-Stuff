package ex5;

public class InvalidPayException extends Exception {
	public InvalidPayException() {
		super("pay cannot be negative or above 25");
	}
}
