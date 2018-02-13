package ex1;

public class Rainfall {
	
	private String[] months = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	private double[] rainfall = new double[12];
	
	public Rainfall(double[] rainfall) {
		for(int i = 0; i < this.rainfall.length; i++) {
			this.rainfall[i] = rainfall[i];
		}
	}
	
	public double GetTotalRainfall() {
		double total = 0;
		for(double rain : rainfall) {
			total += rain;
		}
		return total;
	}
	
	public double GetAverageRainfall() {
		double total = 0;
		for(double rain : rainfall) {
			total += rain;
		}
		return total / rainfall.length;
	}
	
	public String MostRainMonth() {
		int month = 0;
		double rain = rainfall[0];
		for(int i = 0; i < rainfall.length; i++) {
			if(rainfall[i] > rain) {
				month = i;
				rain = rainfall[i];
			}
		}
		
		return months[month];
	}
	
	public String LeastRainMonth() {
		int month = 0;
		double rain = rainfall[0];
		for(int i = 0; i < rainfall.length; i++) {
			if(rainfall[i] < rain) {
				month = i;
				rain = rainfall[i];
			}
		}
		
		return months[month];
	}
}
