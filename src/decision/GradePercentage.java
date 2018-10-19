package decision;

import java.util.Scanner;

public class GradePercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Test Score 1:");
		double score1=input.nextDouble();
		System.out.println("Test Score 2:");
		double score2=input.nextDouble();
		System.out.println("Test score 3:");
		double score3=input.nextDouble();
		System.out.println("Did you do the extra credit?");
		boolean answer=input.nextBoolean();
	if (answer==true){
System.out.println("Points earned: ");
double ec=input.nextDouble();
double points=((score1+score2+score3)/3)+ec;
System.out.println(points);
}
}
}