package ex11;

public class InvalidPayRate extends Exception {
	public InvalidPayRate() {
		super("Payrate cannot be a negative number");
	}
}
