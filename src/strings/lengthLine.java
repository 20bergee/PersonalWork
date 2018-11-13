package strings;

import java.util.Scanner;

public class lengthLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int lines=0;
		System.out.println("What did you do today?");
		String day=input.nextLine();
		for(lines=0; lines<day.length(); lines++){
		System.out.println(day.charAt(lines));
	}
	}

}
