package ex3;

public class RoomDimension {
	private double length;
	private double width;
	
	public RoomDimension(double len, double w) {
		length = len;
		width = w;
	}
	
	public double GetArea() {
		return length * width;
	}
	
	public String toString() {
		return "area of room: " + GetArea();
	}
}
