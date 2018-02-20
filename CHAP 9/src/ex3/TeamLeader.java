package ex3;

public class TeamLeader extends ex1.ProductionWorker {
	private double monthlyBonus;
	private int requiredTrainingHours;
	public int trainingHoursAttended;
	
	public TeamLeader(String n, String num, String date, int sh, double rate, double mb, int rth, int tha) {
		super(n, num, date, sh, rate);
		monthlyBonus = mb;
		requiredTrainingHours = rth;
		trainingHoursAttended = tha;
	}
	
	public TeamLeader() {
		super();
		monthlyBonus = 0;
		requiredTrainingHours = 0;
		trainingHoursAttended = 0;
	}

	public double getMonthlyBonus() {
		return monthlyBonus;
	}

	public void setMonthlyBonus(double monthlyBonus) {
		this.monthlyBonus = monthlyBonus;
	}

	public int getRequiredTrainingHours() {
		return requiredTrainingHours;
	}

	public void setRequiredTrainingHours(int requiredTrainingHours) {
		this.requiredTrainingHours = requiredTrainingHours;
	}

	public int getTrainingHoursAttended() {
		return trainingHoursAttended;
	}

	public void setTrainingHoursAttended(int trainingHoursAttended) {
		this.trainingHoursAttended = trainingHoursAttended;
	}
	
	public String toString() {
		return String.format(super.toString()
							+ "Monthly Bonus: $%,.2f\n"
							+ "Required Training Hours: %d\n"
							+ "Training Hours Attended: %d\n", this.monthlyBonus, this.requiredTrainingHours, this.trainingHoursAttended);
	}
}
