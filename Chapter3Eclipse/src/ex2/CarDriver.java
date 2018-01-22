package ex2;

public class CarDriver {

	public static void main(String[] args) {
		  Car car1 = new Car(1999, "Vroom Mobile");
	        
	        System.out.printf("car year: %d, car model: %s\n\n", car1.GetYearModel(), car1.GetMake());
	        
	        car1.Accelerate();
	        System.out.printf("Accellerating, speed is now %s\n", car1.GetSpeed());
	        car1.Accelerate();
	        System.out.printf("Accellerating, speed is now %s\n", car1.GetSpeed());
	        car1.Accelerate();
	        System.out.printf("Accellerating, speed is now %s\n", car1.GetSpeed());
	        car1.Accelerate();
	        System.out.printf("Accellerating, speed is now %s\n", car1.GetSpeed());
	        car1.Accelerate();
	        System.out.printf("Accellerating, speed is now %s\n", car1.GetSpeed());

	        car1.Brake();
	        System.out.printf("Braking, speed is now %s\n", car1.GetSpeed());
	        car1.Brake();
	        System.out.printf("Braking, speed is now %s\n", car1.GetSpeed());
	        car1.Brake();
	        System.out.printf("Braking, speed is now %s\n", car1.GetSpeed());
	        car1.Brake();
	        System.out.printf("Braking, speed is now %s\n", car1.GetSpeed());
	        car1.Brake();
	        System.out.printf("Braking, speed is now %s\n", car1.GetSpeed());
	        System.exit(0);

	}

}
