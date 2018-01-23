package ex9;
import javax.swing.JOptionPane;

public class EX9 {

	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Enter the radius of the circle");
		Circle circle1 = new Circle(Double.parseDouble(userInput));
		
		System.out.printf("the circles area is %s\n", circle1.GetArea());
		System.out.printf("The circles Diameter is %s\n", circle1.GetDiameter());
		System.out.printf("The circles Circumference is %s\n", circle1.GetCircumfrence());
		System.exit(0);
	}

}
