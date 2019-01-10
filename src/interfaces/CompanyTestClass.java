package interfaces;
import java.util.Scanner;
import java.util.ArrayList;
public class CompanyTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
ArrayList <Employee> employees=new <Employee> ArrayList();
System.out.println("How many employees are there?");
int numEmployee=input.nextInt();
for(int i=0; i<=numEmployee; i++){
	Employee bob=new Employee();
	employees.add(bob);
}
System.out.println("Raise:");
double raise=input.nextDouble();
if(raise<0){
	raise=0;
}
employees.get(employees.size()-1).modifyRate(raise);
for(int i=0; i<employees.size(); i++){
	System.out.println(employees.get(i).calcPay(7));
}
double total=0;
for(int i=0; i<employees.size(); i++){
	for(int j=1; j<=52;j++){
		total+=employees.get(i).calcPay(j);
	}
}
System.out.println("Total paid to the employees: $"+total);
}
}