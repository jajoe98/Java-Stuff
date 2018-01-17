import javax.swing.JOptionPane;

public class EX13
{
    //the tip should be 18% of the total
    public static double taxRate = 0.075;
    public static double total;
    public static double mealCharge;
    public static double tax;
    public static double tip;
    
    public static void main(String[] args)
    {
        String chargeString = JOptionPane.showInputDialog("What was the price for the meal?");
        mealCharge = Double.parseDouble(chargeString);
        tax = mealCharge * taxRate;
        total = mealCharge + tax;
        tip = total * 0.18;
        
        System.out.printf("meal charge: $%.2f \n", mealCharge);
        System.out.printf("tax: $%.2f \n", tax);
        System.out.printf("total: $%.2f \n", total);
        System.out.printf("tip: $%.2f", tip);
        System.exit(0);
    }
}