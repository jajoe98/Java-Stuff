package ex4;

public class InvalidMonthNumException extends Exception{
	public InvalidMonthNumException() {
		super("Month cannot be bellow 1 or above 12");
	}
}
