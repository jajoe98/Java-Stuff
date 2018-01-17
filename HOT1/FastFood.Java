import javax.swing.JOptionPane;

public class FastFood
{
    //declaring all variables that will be used
    //input variable for converting what user types
    public static String customerInput;
    public static int numberOfHamburgers;
    public static int numberOfCheeseburgers;
    public static int numberOfSodas;
    public static int numberOfFries;
    public static String name;
    public static double totalPrice;
    
    public static void main(String[] args)
    {
        //ask how many hamburgers are wanted
        customerInput = JOptionPane.showInputDialog("How many hamburgers?");
        numberOfHamburgers = Integer.parseInt(customerInput);
        //ask how many cheeseburgers are wanted
        customerInput = JOptionPane.showInputDialog("How many cheeseburgers?");
        numberOfCheeseburgers = Integer.parseInt(customerInput);
        //ask how many sodas are wanted
        customerInput = JOptionPane.showInputDialog("how many sodas?");
        numberOfSodas = Integer.parseInt(customerInput);
        //ask how many fries are wanted
        customerInput = JOptionPane.showInputDialog("how many fries?");
        numberOfFries = Integer.parseInt(customerInput);
        //ask for name
        name = JOptionPane.showInputDialog("what is your name?");
        //doing math for total price
        totalPrice = (numberOfHamburgers * 1.25)+(numberOfCheeseburgers * 1.50)+(numberOfSodas * 1.95)+(numberOfFries * 0.95);
        //really fancy recipt printing all the info even though we technically only needed the name and total
        System.out.printf("order for    %s \n", name.toUpperCase());
        System.out.printf("------------------------- \n");
        System.out.printf("hburg:   %d \n", numberOfHamburgers);
        System.out.printf("cburg:   %d \n", numberOfCheeseburgers);
        System.out.printf("sodas:   %d \n", numberOfSodas);
        System.out.printf("fries:   %d \n", numberOfFries);
        System.out.printf("Total:   $%,.2f", totalPrice);
        //exits program so it doesnt slowly kill the computer
        System.exit(0);
    }
}