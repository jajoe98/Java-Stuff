package ex7;

public class EX7 {

	public static void main(String[] args) {
		RetailItem item = new RetailItem("Swoop brand candy bar", 17789, 0.75, 1.5);
		
		System.out.println(item.toString());
		item.SetWholesale(1);
		item.SetRetail(2);
		System.out.println("after change:\n" + 
							"WholeSale: " + item.GetWholesale() +
							"\nRetail: " + item.GetRetail());
	}

}
