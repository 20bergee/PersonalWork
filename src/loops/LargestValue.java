package loops;

import java.util.Scanner;

public class LargestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number=0.0;
		double largest=0.0;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number. (9999 to quit):");
		number=input.nextInt();
		while(number!=9999)
		{
			System.out.println("Please enter a number. (9999 to quit):");
			number=input.nextInt();
			if (number>largest){
			largest=number;
		}
	
		}
		System.out.println("The largest number is"+largest);
	}

}
