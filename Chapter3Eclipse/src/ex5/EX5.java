package ex5;

public class EX5 {

	public static void main(String[] args) {
		RetailItem item1 = new RetailItem();
		RetailItem item2 = new RetailItem();
		RetailItem item3 = new RetailItem();

		item1.SetDescription("Jacket");
		item2.SetDescription("Designer Jeans");
		item3.SetDescription("Shirt");

		item1.SetUnits(12);
		item2.SetUnits(40);
		item3.SetUnits(20);

		item1.SetPrice(59.95);
		item2.SetPrice(34.95);
		item3.SetPrice(24.95);

		System.out.printf("item1: %18s: price: %5.2f Units: %3d\n", item1.GetDescription(), item1.GetPrice(), item1.GetUnits());
		System.out.printf("item2: %18s: price: %5.2f Units: %3d\n", item2.GetDescription(), item2.GetPrice(), item2.GetUnits());
		System.out.printf("item3: %18s: price: %5.2f Units: %3d\n", item3.GetDescription(), item3.GetPrice(), item3.GetUnits());
	}

}
