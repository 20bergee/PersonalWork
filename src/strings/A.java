package strings;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Sentence:");
		String sentence=input.nextLine();
boolean a=false;
boolean space=false;
for (int index=0; index<sentence.length(); index++){
	if (sentence.charAt(index)!=('a')&&sentence.charAt(index)!=(' ')){
		System.out.println(sentence.charAt(index));	
	}

}

	}

}
