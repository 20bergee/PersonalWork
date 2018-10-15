
public class Worker {
	// instance field
	private int hours;
	private double rate;
	private double raise;
	// constructor
	public Worker() {
		hours = 0;
		rate = 0.0;
		raise=0.0;
	}
	public Worker(int hours, double rate,double raise){
	}
	public void setHours(int newHours) {
		hours = newHours;
	}
	public int getHours(int newHours) {
		return hours;
	}

	public double getRate(double newRate) {
		return newRate;
	}

	public void setRate(double newRate) {
		rate = newRate;
	}
public double payCheck(double finalcheck){
	finalcheck=rate*hours;
	return finalcheck;
}
public void setRaise(double newraise){
raise=newraise;
}
public double getRaise(double newRate){
	newRate=raise+rate;
	return newRate;
}
}
