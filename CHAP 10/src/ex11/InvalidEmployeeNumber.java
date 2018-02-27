package ex11;

public class InvalidEmployeeNumber extends Exception {
	public InvalidEmployeeNumber() {
		super("employee number cannot be negative or higher than 9999");
	}
}
