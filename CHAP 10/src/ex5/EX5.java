package ex5;

public class EX5 {

	public static void main(String[] args) {
		try {
			Payroll swoop = new Payroll("swoop", 566, 50, 30);
			
			System.out.println(swoop.toString());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
