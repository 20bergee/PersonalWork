package strings;

import java.util.Scanner;

public class FourthCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Sentence:");
		String sentence=input.nextLine();
for (int index=0; index<sentence.length(); index+=4)
System.out.println(sentence.charAt(index));
	}

}
