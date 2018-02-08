package ex11;

import java.util.Scanner;

public class EX11 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int response;
		double input1;
		double input2;
		
		do {
			System.out.println("Geomety Calculator");
			System.out.println();
			System.out.println("1. Calculate the area of a circle");
			System.out.println("2. Calculate the area of a rectangle");
			System.out.println("3. Calculate the area of a triangle");
			System.out.println("4. exit");
			System.out.println();
			System.out.print("Enter your choice (1-4): ");
			response = keyboard.nextInt();
			
			switch(response) {
			case 1:
				System.out.println("Enter the radius of the circle");
				System.out.printf("The area of your circle is: %.2f\n", Geometry.CircleArea(keyboard.nextDouble()));
				System.out.println();
				break;
			case 2:
				System.out.println("Enter the width of the rectangle");
				input1 = keyboard.nextDouble();
				System.out.println("Enter the length of the rectangle");
				input2 = keyboard.nextDouble();
				System.out.printf("the area of your rectangle is: %.2f\n", Geometry.RectangleArea(input1, input2));
				System.out.println();
				break;
			case 3:
				System.out.println("Enter the base of the triangle");
				input1 = keyboard.nextDouble();
				System.out.println("Enter the height of the triangle");
				input2 = keyboard.nextDouble();
				System.out.printf("the area of your triangle is: %.2f", Geometry.TriangleArea(input1, input2));
				System.out.println();
				break;
			case 4:
				break;
			default:
				System.out.println("Invalid number entered");
				System.out.println();
				break;
			}
		}while(response != 4);
	}

}
