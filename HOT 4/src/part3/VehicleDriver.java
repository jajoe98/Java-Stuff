package part3;

public class VehicleDriver {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		Vehicle car = new Car();
		Vehicle truck = new Truck();
		vehicle.Accelerate();
		car.Accelerate();
		truck.Accelerate();
		System.out.println("vehicle's speed after 1 acceleration is: " + vehicle.GetSpeed());
		System.out.println("car's speed after 1 acceleration is: " + car.GetSpeed());
		System.out.println("truck's speed after 1 acceleration is: " + truck.GetSpeed());
	}

}
