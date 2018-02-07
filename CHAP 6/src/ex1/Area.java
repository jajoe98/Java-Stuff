package ex1;

public class Area {
	
	public double GetArea(int radius) {
		return Math.PI * (radius * radius);
	}
	
	public double GetArea(int width, int length) {
		return width * length;
	}
	
	public double GetArea(int height, double radius) {
		return Math.PI * (radius * radius) * height;
	}
}
