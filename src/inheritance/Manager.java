package inheritance;

public class Manager extends Employee{
private double level;
public Manager(){
	super();
	level=4.0;
}
public Manager(String xName, double xRate, double xLevel){
	super(xName, xRate);
	level=xLevel;
}
public double calcPay(double xHours){
	return (super.getRate()*xHours)+(level/100);
}
public Manager clone(){
	return new Manager(super.getName(), super.getRate(), level);
}
}
