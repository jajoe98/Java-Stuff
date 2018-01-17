import javax.swing.JOptionPane;

public class EX15
{
    public static int numOfCookies;
    
    public static void main(String[] args)
    {
        String stringOfCookies = JOptionPane.showInputDialog("how many cookies would you like to make?");
        numOfCookies = Integer.parseInt(stringOfCookies);
        System.exit(0);
    }
}