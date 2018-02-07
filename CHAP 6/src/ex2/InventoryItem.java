package ex2;

public class InventoryItem {
	private String description;
	private int units;
	
	public InventoryItem(String description, int units) {
		this.description = description;
		this.units = units;
	}
	
	public InventoryItem(InventoryItem item) {
		description = item.description;
		units = item.units;
	}
	
	public String ToString() {
		return description + ", Quantity: " + units;
	}
}
