package interfaces;
import java.util.Random;
public class Employee {
private String name;
private double rate;
private double[] hours=new double[52];
private static int classNumber=0;
private int employeeNumber;
public Employee(){
	name="John Smith";
	rate=10.00;
	Random generator=new Random();
for(int i=0; i<hours.length; i++){
	hours[i]=0+generator.nextInt(40-0+1);
}
employeeNumber=classNumber;
classNumber++;
}
public void modifyRate(double addMoney){
	rate+=addMoney;
}
public double calcPay(int week){
	return rate*hours[week-1];

}
}
