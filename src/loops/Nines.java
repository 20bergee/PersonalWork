package loops;

import java.util.Scanner;

public class Nines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number. (9999 to quit):");
		number = input.nextDouble();
		while(number!=9999)
		{
			System.out.println("Your number times two is: "+number*2);
			System.out.println("Please enter a number. (9999 to quit):");
			number=input.nextDouble();
		}
		
	}

}
