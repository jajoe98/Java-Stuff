package ex8;

public class CashRegister {
	private RetailItem item;
	private int quantity;
	
	public CashRegister(RetailItem item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}
	
	public double GetSubtotal() {
		return quantity * item.GetRetail();
	}
	
	public double GetTax() {
		return this.GetSubtotal() * 0.06;
	}
	
	public double GetTotal() {
		return this.GetSubtotal() + this.GetTax();
	}
	
	public String toString() {
		String str = String.format("SALES RECEIPT\n" + 
									"Unit Price: $%,.2f\n" +
									"Quantity: %,d\n" +
									"Subtotal: $%,.2f\n" +
									"Sales Tax: $%,.2f\n" +
									"Total: $%,.2f", item.GetRetail(), quantity, this.GetSubtotal(), this.GetTax(), this.GetTotal());
		return str;
	}
}
