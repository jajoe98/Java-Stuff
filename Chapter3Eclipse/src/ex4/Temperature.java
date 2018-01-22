package ex4;

public class Temperature {
	//initializer
	public double ftemp;
	
	//Constructor
	public Temperature(double temp)
	{
		ftemp = temp;
	}
	
	//Mutator
	public void setFahrenheit(double temp)
	{
		ftemp = temp;
	}
	
	//Accessors
	public double getFahrenheit()
	{
		return ftemp;
	}
	
	public double getCelsius()
	{
		return (5/9.0) * (ftemp - 32.0);
	}
	
	public double getKelvin()
	{
		return (5/9) * (ftemp - 32) + 273;
	}
}
