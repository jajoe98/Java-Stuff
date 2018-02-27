package ex4;

public class InvalidMonthNameException extends Exception{
	public InvalidMonthNameException(){
		super("A valid month name was not entered");
	}
}
