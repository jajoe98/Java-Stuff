package ex4;

public class EX4 {

	public static void main(String[] args) {
		try {
			Month month1 = new Month(13);
			System.out.println(month1.toString());
			
			Month month2 = new Month("june");
			System.out.println(month2.toString());
			
		} catch (InvalidMonthNumException e) {
			System.out.println(e.getMessage());
		} catch (InvalidMonthNameException e) {
			System.out.println(e.getMessage());
		}
	}

}
