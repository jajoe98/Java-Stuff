package ex12;

public class EX12 {

	public static void main(String[] args) {
		FuelGauge fuelg = new FuelGauge();
		Odometer odom = new Odometer(0, fuelg);
		
		while(odom.getFuelGauge().GetGallons() < 15) {
			odom.getFuelGauge().IncrementGallons();
		}
		System.out.println("The car is now fueled");
		
		while(odom.getFuelGauge().GetGallons() > 0) {
			odom.IncrementMileage();
			System.out.printf("The current mileage on the car is %d\n", odom.getMileage());
		}
		System.out.println("out of gas");
	}

}
