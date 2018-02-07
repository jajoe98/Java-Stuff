package ex2;

public class EX2 {

	public static void main(String[] args) {
		InventoryItem item1 = new InventoryItem("A bucket", 3);
		InventoryItem item2 = new InventoryItem(item1);
		
		System.out.println("Item1: " + item1.ToString() +
				"\nItem2: " + item2.ToString());
	}

}
