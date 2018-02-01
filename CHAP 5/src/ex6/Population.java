package ex6;

public class Population {
	int startingPop;
	double dailyIncrease;
	int daysToGrow;
	
	public Population(int startingPop, double dailyIncrease, int daysToGrow) {
		super();
		this.startingPop = startingPop;
		this.dailyIncrease = dailyIncrease;
		this.daysToGrow = daysToGrow;
	}
	
	public void Populate() {
		
		double currentPop = startingPop;
		
		System.out.printf("the population started at %d\n", startingPop);
		
		for(int i=1; i <= daysToGrow; i++) {
			currentPop += currentPop * dailyIncrease;
			System.out.printf("after day %d the population was at %.0f\n", i, currentPop);
		}
	}
}
