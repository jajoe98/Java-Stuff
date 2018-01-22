public class Car
{
	//initializers
    public int yearModel;
    public String make;
    public int speed;
    
    //constructor
    public Car(int year, String newMake)
    {
    	yearModel = year;
    	make = newMake;
    	speed = 0;
    }
    
    //Accessors
    public int GetYearModel()
    {
    	return yearModel;
    }
    
    public String GetMake()
    {
    	return make;
    }
    
    public int GetSpeed()
    {
    	return speed;
    }
    
    //accelerate method that increses speed by 5
    public void Accelerate() 
    {
    	speed += 5;
    }
    
    //brake method that devreases speed by 5
    public void Brake()
    {
    	speed -= 5;
    }
}