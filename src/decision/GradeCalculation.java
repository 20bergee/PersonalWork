package decision;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Test average:");
		double test = input.nextDouble();
		System.out.println("Homework average:");
		double hw = input.nextDouble();
		System.out.println("Your teacher is nice? (true or false)");
		boolean answer = input.nextBoolean();
		if (answer == true) {
			if (test > hw) {
				System.out.println("Your grade is " + test);
			} 
			else 
			{
				System.out.println("Your grade is " + hw);
			}}

		else {
			if (test > hw) {
				System.out.println("Your grade is " + hw);
			} 
			else {
				System.out.println("Your grade is " + test);
			}
		}}}

