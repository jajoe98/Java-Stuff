package hot2;

public class Lawn {
	private int width;
	private int length;
	
	//constructors
	public Lawn() {
		width = 0;
		length = 0;
	}
	public Lawn(int width, int length) {
		this.width = width;
		this.length = length;
	}
	
	//Accessors
	public int GetWidth() {
		return width;
	}
	public int GetLength() {
		return length;
	}
	
	//mutators
	public void SetWidth(int width) {
		this.width = width;
	}
	public void SetLength(int length) {
		this.length = length;
	}
	
	//method that returns the area of the lawn
	public int GetLawnArea() {
		return width * length;
	}
}
