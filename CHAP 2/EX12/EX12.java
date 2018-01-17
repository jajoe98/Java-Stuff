import javax.swing.JOptionPane;

public class EX12
{
    public static String cityName;
    public static int cityNameLength;
    public static char FirstChar;
    
    
    public static void main(String[] args)
    {
        cityName = JOptionPane.showInputDialog("Enter a city name");
        cityNameLength = cityName.length();
        FirstChar = cityName.charAt(0);
        System.out.printf("%s \nnumber of chars: %d \n%s \n%s \nfirst char: %s", cityName, cityNameLength, cityName.toUpperCase(), cityName.toLowerCase(), FirstChar);
        System.exit(0);
    }
}