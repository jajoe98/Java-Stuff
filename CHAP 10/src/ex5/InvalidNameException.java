package ex5;

public class InvalidNameException extends Exception {
	public InvalidNameException(){
		super("Must enter a name");
	}
}
