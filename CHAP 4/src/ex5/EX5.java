package ex5;

public class EX5 {

	public static void main(String[] args) {
		BankCharges bank = new BankCharges(500, 60);
		System.out.printf("the account started at $%.2f\nThe service fees total is $%.2f\nthe ending balance is $%.2f", bank.getBalance(), bank.CalcService(), bank.getBalance() - bank.CalcService());
	}

}
