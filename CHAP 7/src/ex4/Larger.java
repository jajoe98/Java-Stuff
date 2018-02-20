package ex4;

public class Larger {
	public static void LargerThan(int[] numbers, int n) {
		String greaterNums = "";
		
		for(int currentNum : numbers) {
			if(currentNum > n) {
				greaterNums += currentNum + ", ";
			}
		}
		
		System.out.println(greaterNums);
	}
}
