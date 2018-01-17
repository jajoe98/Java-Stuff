import javax.swing.JOptionPane;

public class EX18
{
    //buying
    public static int stocksBought = 1000;
    public static double pricePerStockBought = 32.87;
    public static double priceBeforeCommissionBought = stocksBought * pricePerStockBought;
    public static double commission = 0.02;
    public static double totalBought = (priceBeforeCommissionBought * commission) + priceBeforeCommissionBought;
    
    //selling
    public static int stocksSold = 1000;
    public static double pricePerStockSold = 33.92;
    public static double priceBeforeCommissionSold = stocksSold * pricePerStockSold;
    public static double totalProfit = priceBeforeCommissionSold - (priceBeforeCommissionSold * commission) - totalBought;
    
    public static void main(String[] args)
    {
        System.out.printf("The price for 1000 stocks is $%.2f \n", priceBeforeCommissionBought);
        System.out.printf("The commission is at %.0f percent \n", commission * 100);
        System.out.printf("The total price is $%.2f \n\n", totalBought);

        System.out.printf("The price for selling 1000 stocks is $%.2f \n", priceBeforeCommissionSold);
        System.out.printf("The commission is at %.0f percent \n", commission * 100);
        System.out.printf("The total profit is $%.2f", totalProfit);
        System.exit(0);
    }
}