package loops;

import java.util.Scanner;

public class FavNumHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("What is your favorite number?");
		int favNum=input.nextInt();
		int counter=0;
		for (counter=1; counter<=10; counter=counter+1)
		{
			System.out.println(favNum+" Hello");
		}
	}

}
