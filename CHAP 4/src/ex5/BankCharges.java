package ex5;

public class BankCharges {
	public double balance;
	public int numOfChecks;
	
	public BankCharges(double startingBal, int checks) {
		balance = startingBal;
		numOfChecks = checks;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getNumOfChecks() {
		return numOfChecks;
	}

	public void setNumOfChecks(int numOfChecks) {
		this.numOfChecks = numOfChecks;
	}

	public double CalcService() {
		double totalCharge = 10.00;
		
		if((balance - totalCharge) < 400) {
			totalCharge += 15;
		}
		
		if(numOfChecks >= 60) {
			totalCharge += numOfChecks * 0.04;
		}
		else if(numOfChecks >= 40) {
			totalCharge += numOfChecks * 0.06;
		}
		else if(numOfChecks >= 20) {
			totalCharge += numOfChecks * 0.08;
		}
		else if(numOfChecks < 20) {
			totalCharge += numOfChecks * 0.10;
		}
		
		return totalCharge;
	}
}
