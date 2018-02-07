package ex13;

public class EX13 {

	public static void main(String[] args) {
		int fahrenheit;
		for(int c = 0; c <= 20; c++) {
			
			fahrenheit = ((9/5) * c) + 32;
			
			System.out.printf("The fahrenheit temperature for %d centigrade is %d\n", c, fahrenheit);
		}
	}

}
