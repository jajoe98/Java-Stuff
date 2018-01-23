package ex9;

public class Circle {
	public double radius;
	public double PI = 3.14159;
	
	public Circle(double newRadius) {
		radius = newRadius;
	}
	
	public void SetRadius(double newRadius) {
		radius = newRadius;
	}
	
	public double GetRadius() {
		return radius;
	}
	
	public double GetArea() {
		return PI * radius * radius;
	}
	
	public double GetDiameter() {
		return radius * 2.0;
	}
	
	public double GetCircumfrence() {
		return 2.0 * PI * radius;
	}
}
