package ex11;

public class Geometry {
	public static double CircleArea(double radius) {
		if(radius < 0) {
			System.out.println("that number is invalid");
			return 0;
		}
		else {
			return Math.PI * (radius * radius);
		}
	}
	
	public static double RectangleArea(double width, double length) {
		if(width < 0 || length < 0) {
			System.out.println("an invalid number was entered");
			return 0;
		}
		else {
		return width * length;
		}
	}
	
	public static double TriangleArea(double base, double height) {
		if(base < 0 || height < 0) {
			System.out.println("an invalid number was entered");
			return 0;
		}
		else {
			return base * height * 0.5;
		}
	}
}
