package decision;

import java.util.Scanner;

public class YouWon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("How much money did you recieve for your fifth birthday?");
		double amount=input.nextDouble();
	if ((Math.abs(Math.sqrt(84.3)-amount))<0.01){
	System.out.println("You won a good prize!");}
	else{
		System.out.println("You have won a bad prize");
	}
	}

}
