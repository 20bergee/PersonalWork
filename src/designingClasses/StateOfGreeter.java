package designingClasses;
import objectOperators.Circle;
import java.util.Scanner;
import java.util.ArrayList;
public class StateOfGreeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
ArrayList <Circle> circles=new <Circle> ArrayList();
System.out.println("How many Circle would you like to create?");
int numCircle=input.nextInt();
for (int i=0; i<numCircle; i++){
	System.out.println("Radius of Circle:");
	double radius=input.nextDouble();
	Circle pizza=new Circle(radius);
	circles.add(pizza);
}
System.out.println("Circle info:");
for (Circle dimensions: circles){
	dimensions.displayInfo();
}
	}

}
