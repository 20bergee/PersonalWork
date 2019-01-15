package inheritance;

public class Employee {
private String name;
private double rate;
public Employee(){
	name="Judie Prudie";
	rate=7.25;
}
public Employee(String xName, double xRate){
	name=xName;
	rate=xRate;
}
public double calcPay(double xHours){
	return rate*xHours;
}
public double getRate(){
	return rate;
}
public String getName(){
	return name;
}
public String toString(){
	return "Employee - Name: "+name+" Rate: $"+rate;
}
public boolean equals(Object xObject){
	return this.toString().equals(xObject.toString());
}
}
