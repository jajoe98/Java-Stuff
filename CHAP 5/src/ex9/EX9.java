package ex9;

import java.util.Scanner;

public class EX9 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Payroll worker = new Payroll();
		
		int id;
		double grossPay;
		double stateTax;
		double fedTax;
		double fica;
		
		do {
			//set id
			do {
				System.out.println("Enter the employe ID (0 to end)");
				id = keyboard.nextInt();
			}while(id < 0);
			
			//break loop if 0 is entered
			if(id == 0) break;
			worker.setId(id);
			
			//set grossPay
			do {
				System.out.println("what is the employees gross pay?");
				grossPay = keyboard.nextDouble();
			}while(grossPay < 0);
			worker.setGrossPay(grossPay);
			
			//state tax
			do {
				System.out.println("what is the state tax for this employee?");
				stateTax = keyboard.nextDouble();
			}while(stateTax < 0 || stateTax > grossPay);
			worker.setStateTax(stateTax);
			
			//federal tax
			do {
				System.out.println("What is the federal tax for this employee?");
				fedTax = keyboard.nextDouble();
			}while(fedTax < 0 || fedTax > grossPay);
			worker.setFedTax(fedTax);
			
			//FICA withholdings
			do {
				System.out.println("What are the FICA withholdings for this employee");
				fica = keyboard.nextDouble();
			}while(fica < 0 || fica > grossPay);
			worker.setFica(fica);
			

			System.out.println("-----------------------------");
			System.out.printf("Worker ID: %d\n", worker.getId());
			System.out.printf("Gross Pay: $%.2f\n", worker.getGrossPay());
			System.out.printf("State Tax: $%.2f\n", worker.getStateTax());
			System.out.printf("Federal Tax: $%.2f\n", worker.getFedTax());
			System.out.printf("FICA withholdings: $%.2f\n", worker.getFica());
			System.out.printf("NET PAY: $%.2f\n", worker.GetNetPay());
			System.out.println("-----------------------------");
		}while(id != 0);
	}

}
