import javax.swing.JOptionPane;

public class EX14
{
    public static int stocks = 1000;
    public static double pricePerStock = 25.50;
    public static double priceBeforeCommission = stocks * pricePerStock;
    public static double commission = 0.02;
    public static double total = (priceBeforeCommission * commission) + priceBeforeCommission;
    
    public static void main(String[] args)
    {
        System.out.printf("The price for 1000 stocks is $%.2f \n", priceBeforeCommission);
        System.out.printf("The commission is at %.0f percent \n", commission * 100);
        System.out.printf("The total price is $%.2f", total);
        System.exit(0);
    }
}