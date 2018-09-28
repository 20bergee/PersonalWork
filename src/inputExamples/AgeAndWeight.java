package inputExamples;
import java.util.Scanner;
public class AgeAndWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=4;
		Scanner input=new Scanner(System.in);
		System.out.println("How old are you? ");
		age=input.nextInt();
		System.out.println("You are "+age+" years old");
		int weight=120;
		System.out.println("How much do you weigh? ");
		weight=input.nextInt();
		System.out.println("You weigh "+weight+" pounds");
	}

}
