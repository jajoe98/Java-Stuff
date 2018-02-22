package ex2;

public class InvalidTestScore extends Exception{
	public InvalidTestScore(){
		super("Test score cannot be a negative number or over 100");
	}
}
