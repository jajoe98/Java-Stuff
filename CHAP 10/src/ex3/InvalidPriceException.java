package ex3;

public class InvalidPriceException extends Exception{
	public InvalidPriceException() {
		super("price cannot be a negative number");
	}
}
