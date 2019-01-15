package inheritance;

public class Worker extends Employee{
	private int years;
public Worker(){
	super();
	years=5;
}
public Worker(String xName, double xRate, int xYears){
	super(xName, xRate);
	years=xYears;
}
double pay=0;
public double calcPay(double xHours){
	if (years>10){
pay=super.getRate()*xHours;
		pay+=(super.getRate()*xHours)*0.2;
	}
	else{
		pay=super.getRate()*xHours;
	}
	return pay;
}
public String toString(){
	return "Worker - Years: "+years+" Name:"+super.getName()+" Rate: "+super.getRate();
}
public int getYears(){
	return years;
}}
