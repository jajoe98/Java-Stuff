package ex4;

public class Sale {
	public final double PRICE = 99.00;
	public int quantitySold;
	
	public Sale(int quantity) {
		quantitySold = quantity;
	}
	
	public double CalcTotal() {
		double total = quantitySold * PRICE;
		
		if(quantitySold >= 100) {
			total = total * 0.50;
		}
		else if((quantitySold >= 50) && (quantitySold < 100)) {
			total = total * 0.40;
		}
		else if((quantitySold >= 20) && (quantitySold < 50)) {
			total = total * 0.30;
		}
		else if((quantitySold >= 10)&&(quantitySold < 20)) {
			total = total * 0.20;
		}
		
		return total;
	}
}
