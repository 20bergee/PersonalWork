package loops;

import java.util.Scanner;

public class CountThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count=0;
		count=0;System.out.println("End number?");
		double end = input.nextDouble();
		while(count<=end)
		{
			System.out.println(count);
			count = count + 2;
		}

	}

}
