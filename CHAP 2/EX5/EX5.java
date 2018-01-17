import javax.swing.JOptionPane;

public class EX5
{
    //4 cookies = 1 serving
    public static int caloriesPerServing = 300;
    public static int cookiesEaten;
    public static double totalServings;
    public static double totalCalories;
    public static String eatenInput;
    
    public static void main(String[] args)
    {
        //user enters 10
        eatenInput = JOptionPane.showInputDialog("How many cookies did you eat?");
        cookiesEaten = Integer.parseInt(eatenInput);
        //10 / 4 = 2.5 servings
        totalServings = cookiesEaten / 4.0;
        //2.5 * 300 = 750 calories
        totalCalories = totalServings * caloriesPerServing;
        System.out.printf("You ate %.0f calories of cookies", totalCalories);
        System.exit(0);
    }
}