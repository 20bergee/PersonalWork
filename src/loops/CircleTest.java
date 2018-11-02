package loops;
import java.util.Scanner;
import objectOperators.Circle;
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
int counter=0;
double largest=0.0;
double perimeter=0.0;
double enteredRadius=0.0;
int largestCircle=0;
System.out.println("Enter the radius:");
enteredRadius=input.nextDouble();
counter++;
do {
System.out.println("Enter the radius:");
enteredRadius=input.nextDouble();
counter++;
if (enteredRadius>largest){
	largest=enteredRadius;
}
if (enteredRadius==largest){
largestCircle=counter;
}
}
while (counter<3);
Circle bob=new Circle(largest);
perimeter=bob.getCircumference();
System.out.println("The biggest circle is circle "+largestCircle+" with a perimeter of "+perimeter);
	}
}


	
