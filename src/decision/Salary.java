package decision;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How much money do you make each year?");
		double salary = input.nextDouble();
		if (salary >= 100000) {
			System.out.println("You are an owner!");
		} else {
			if (salary >= 40000) {
				System.out.println("You are a CEO!");
			} else {
				if (salary >= 20000) {
					System.out.println("You are a manager!");
				} else {
					System.out.println("You are a worker!");
				}
			}
		}
	}
}
