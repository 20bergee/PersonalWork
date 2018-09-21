package inputExamples;
import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int weight=100;
int age=17;
int luckynumber=43;
Scanner input=new Scanner(System.in);
System.out.println("Weight: ");
weight=input.nextInt();
System.out.println("Age: ");
age=input.nextInt();
System.out.println("Lucky Number: ");
luckynumber=input.nextInt();
System.out.println("In " +weight+ " days you will understand Computer Science.");
System.out.println("When this finally happens your grade in the class will be raised by " +age+ "%.");
System.out.println("You will be " +luckynumber+ "rd in the class");


	}

}
