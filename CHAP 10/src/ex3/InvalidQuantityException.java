package ex3;

public class InvalidQuantityException extends Exception{
	public InvalidQuantityException() {
		super("Quantity cannot be a negative number");
	}
}
