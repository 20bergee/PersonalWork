package decision;
import java.util.Scanner;
public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("How old are you?");
		int age=input.nextInt();
		if (age>=18){
			System.out.println("What is your height?");
			double height=input.nextDouble();
			double luckynumbera=height*5;
			System.out.println("Your lucky number is "+luckynumbera);
		}
		else
		System.out.println("What is you weight?");
		double weight=input.nextDouble();
		double luckynumberk=weight/2;
		System.out.println("Your lucky number is "+luckynumberk);
	}

}
