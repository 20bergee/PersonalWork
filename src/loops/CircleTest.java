package loops;
import java.util.Scanner;
import objectOperators.Circle;
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
Circle bob=new Circle();
int counter=0;
double largest=0.0;
System.out.println("Enter the radius:");
double enteredRadius=input.nextDouble();
do {
	double perimeter=bob.getCircumference(enteredRadius);
	if (perimeter>largest){
		perimeter=largest;
	}
counter++;
}
while (counter<=3);
System.out.println("The biggest circle has a perimeter of"+largest);
	}
}
}

	
