package ex11;

public class InvalidShift extends Exception {
	public InvalidShift() {
		super("shift must be 1 for day or 2 for night");
	}
}
