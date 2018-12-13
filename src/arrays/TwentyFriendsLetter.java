package arrays;

import java.util.Scanner;

public class TwentyFriendsLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		String[] names=new String[3];
		for (int counter=0; counter<names.length; counter++){
		System.out.println("Friend "+(counter+1)+":");
		names[counter]=input.nextLine();
			}
		System.out.println("Letter:");
		String letter=input.nextLine();
	for (int counter2=0; counter2<names.length; counter2++){
int numberOfLetters=names[counter2].length();
String lastLetter=names[counter2].substring(numberOfLetters-1);
if (letter.equals(lastLetter)==true){
	System.out.println(names[counter2]);
}
	}
		
	}

}
