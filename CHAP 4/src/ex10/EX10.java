package ex10;

import javax.swing.JOptionPane;

public class EX10 {

	public static void main(String[] args) {
		Liquid temp1 = new Liquid(Integer.parseInt(JOptionPane.showInputDialog("Enter a temperature")));
		String freezingString = "Freezing\n";
		String boilingString = "\nBoiling\n";
		
		//fill the freezing string
		if(temp1.IsEthyFreezing()) {
			freezingString += "Ethyl Alcohol\n";
		}
		if(temp1.IsOxygenFreezing()) {
			freezingString += "Oxygen\n";
		}
		if(temp1.IsWaterFreezing()) {
			freezingString += "Water\n";
		}
		
		//fill the boiling string
		if(temp1.IsEthyBoiling()) {
			boilingString += "Ethyl Alcohol\n";
		}
		if(temp1.IsOxygenBoiling()) {
			boilingString += "Oxygen\n";
		}
		if(temp1.IsWaterBoiling()) {
			boilingString += "Water\n";
		}
		
		System.out.print(freezingString + boilingString);
		System.exit(0);
	}

}
