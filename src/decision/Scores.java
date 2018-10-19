package decision;
import java.util.Scanner;

public class Scores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Test Score 1:");
		double score1=input.nextDouble();
		System.out.println("Test Score 2:");
		double score2=input.nextDouble();
		if (score1>score2)
		{
			System.out.println("Great Job!");
			System.out.println("The difference is "+(score1-score2));
		}
System.out.println("Have a nice day");
	}

}
