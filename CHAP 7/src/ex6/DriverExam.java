package ex6;

import java.util.Scanner;

public class DriverExam {
	private String[] correctAnswers = new String[] {"B", "D", "A", "A", "C", 
											 "A", "B", "A", "C", "D", 
											 "B", "C", "D", "A", "D", 
											 "C", "C", "B", "D", "A"};
	
	private String[] studentAnswers = new String[correctAnswers.length];
	
	private int Correct;
	private int Incorrect;
	
	public DriverExam() {
		Scanner keyboard = new Scanner(System.in);
		for(int i = 0; i < studentAnswers.length; i++) {
			String userInput;
			do {
				System.out.println("Enter the answer for question " + (i+1));
				userInput = keyboard.next();
			}while(!userInput.equalsIgnoreCase("A") || !userInput.equalsIgnoreCase("B") || !userInput.equalsIgnoreCase("C") || !userInput.equalsIgnoreCase("D") );
			
			studentAnswers[i] = userInput;
		}
		
		
		
		keyboard.close();
	}
	
	
}
