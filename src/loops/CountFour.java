package loops;

import java.util.Scanner;

public class CountFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count=0;
		count=0;System.out.println("End number?");
		double end = input.nextDouble();
		int sum=0;
		while(count<=end)
		{
			sum+=count;
			count+=2;
		}
		System.out.println("The sum is "+sum);
	}

}
