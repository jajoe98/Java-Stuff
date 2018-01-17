import javax.swing.JOptionPane;

public class EX8
{
    public static double purchaseAmount;
    public static double stateTax;
    public static double countyTax;
    public static double grandTotal;
    
    public static void main(String[] args)
    {
        String purchaseInput = JOptionPane.showInputDialog("enter a price");
        purchaseAmount = Double.parseDouble(purchaseInput);
        stateTax = purchaseAmount * 0.055;
        countyTax = purchaseAmount * 0.02;
        grandTotal = purchaseAmount + stateTax + countyTax;
        System.out.printf("Purchase: %.2f \nState Tax: %.2f \nCounty Tax: %.2f \nGrand Total: %.2f", purchaseAmount, stateTax, countyTax, grandTotal);
        System.exit(0);
    }
}