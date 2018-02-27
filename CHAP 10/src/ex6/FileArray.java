package ex6;

import java.io.*;
import java.util.Scanner;

public class FileArray {
	public static void WriteArray(String fileName, int[] array) throws FileNotFoundException {
		PrintWriter file = new PrintWriter(fileName+".txt");
		
		for(int currentNum : array) {
			file.println(currentNum);
		}
		file.close();
	}
	
	public static void ReadArray(String fileName, int[] array) throws FileNotFoundException {
		File file = new File(fileName+".txt");
		Scanner inputFile = new Scanner(file);
		
		for(int i = 0; i < array.length; i++) {
			array[i] = inputFile.nextInt();
		}
		
		inputFile.close();
	}
}
