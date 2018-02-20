package ex5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChargeAccount {
	public static void SortArray(int[] array) {
		int startScan, index, minIndex, minValue;
		for(startScan = 0; startScan < (array.length-1); startScan++) {
			minIndex = startScan;
			minValue = array[startScan];
			for(index = startScan + 1; index < array.length; index++) {
				if(array[index] < minValue) {
					minValue = array[index];
					minIndex = index;
				}
			}
			array[minIndex] = array[startScan];
			array[startScan] = minValue;
		}
	}
	
	public static int BinarySearch(int[] array, int value) {
		int first, last, middle, position;
		boolean found;
		first = 0;
		last = array.length-1;
		position = -1;
		found = false;
		
		while(!found && first <= last) {
			middle = (first + last) / 2;
			if(array[middle] == value) {
				found = true;
				position = middle;
			}
			else if(array[middle] > value) {
				last = middle - 1;
			}else {
				first = middle + 1;
			}
		}
		
		return position;
	}
	
	public static boolean Validate(int num) throws FileNotFoundException {
		File file = new File("charge account numbers.txt");
		Scanner inputFile = new Scanner(file);
		
		int[] validAccounts = new int[18];
		
		for(int i = 0; inputFile.hasNext() && i < validAccounts.length; i++) {
			validAccounts[i] = inputFile.nextInt();
		}
		
		inputFile.close();
		
		SortArray(validAccounts);
		
		if(BinarySearch(validAccounts, num) == -1) {
			return false;
		}else {
			return true;
		}
	}
}
