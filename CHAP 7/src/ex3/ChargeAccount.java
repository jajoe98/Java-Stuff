package ex3;

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
	
	public static boolean Validate(int num) {
		int[] validAccounts = new int[] {5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
										 8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
										 1005231, 5645231, 3852085, 7576651, 7881200, 4581002};
		SortArray(validAccounts);
		
		if(BinarySearch(validAccounts, num) == -1) {
			return false;
		}else {
			return true;
		}
	}
}
