package ex1;

public class ex1 {

	public static void main(String[] args) {
		Area area = new Area();
		
		System.out.println("the area of a circle with a radius of 20 is: " + area.GetArea(20));
		System.out.println("the area of a rectangle with a height of 12 and a width of 18 is: " + area.GetArea(12, 18));
		System.out.println("The area of a cylinder with a radius of 14 and a height of 5 is: " + area.GetArea(5, 14));
	}

}
