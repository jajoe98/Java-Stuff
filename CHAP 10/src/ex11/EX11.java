package ex11;

public class EX11 {

	public static void main(String[] args) {
		ProductionWorker swoop;
		try {
			swoop = new ProductionWorker("Swoop", 3, "yesterday", 2, 8.00);
			System.out.println(swoop.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
