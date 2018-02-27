package ex6;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX6 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter file name (extention not required)");
		String fileName = keyboard.nextLine();
		System.out.println("How long is the array that will be used?");
		int[] array = new int[keyboard.nextInt()];
		
		int response;
		do {
			System.out.println("Would you like to edit or read the file");
			System.out.println("1.edit");
			System.out.println("2.read");
			System.out.println("any other number will end program");
			response = keyboard.nextInt();
			
			if(response == 1) {
				for(int i = 0; i < array.length; i++) {
					System.out.println("enter number for line " + (i+1));
					array[i] = keyboard.nextInt();
				}
				
				FileArray.WriteArray(fileName, array);
				
			}else if(response == 2) {
				FileArray.ReadArray(fileName, array);
				
				for(int currentNum : array) {
					System.out.println(currentNum);
				}
			}
		}while(response == 1 || response == 2);
		
		keyboard.close();
	}

}
