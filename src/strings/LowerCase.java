package strings;

import java.util.Scanner;

public class LowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("What did you do today?");
		String day=input.nextLine();
		System.out.println(day.toLowerCase());
		System.out.println(day);
	}

}
