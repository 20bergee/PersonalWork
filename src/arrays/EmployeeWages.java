package arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class EmployeeWages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Number of Employees:");
int employees=input.nextInt();
double largest=0;
ArrayList <Double> wages=new ArrayList <Double>();
for(int j=0; j<employees; j++){
	System.out.println("Employee "+(j+1)+"'s wage:");
	wages.add(input.nextDouble());
}
for(double y:wages){
	if (y>largest){
		largest=y;
	}	
}
System.out.println("Highest wage:"+largest);
	}

}
