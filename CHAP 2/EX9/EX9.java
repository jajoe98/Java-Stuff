import javax.swing.JOptionPane;

public class EX9
{
    public static String milesInput;
    public static String gallonsInput;
    public static double milesDriven;
    public static double gallonsUsed;
    public static double milesPerGallon;
    
    public static void main(String[] args) 
    {
        //get miles from user and convert to an int for math
        milesInput = JOptionPane.showInputDialog("How many miles where driven?");
        milesDriven = Double.parseDouble(milesInput);
        //get gallons from user and conver to int for math
        gallonsInput = JOptionPane.showInputDialog("How many gallons of gas was used?");
        gallonsUsed = Double.parseDouble(gallonsInput);
        
        milesPerGallon = milesDriven / gallonsUsed;
        
        System.out.printf("The cars MPG is %.2f", milesPerGallon);
        System.exit(0);
    }
}