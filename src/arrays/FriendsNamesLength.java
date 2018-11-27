package arrays;

import java.util.Scanner;

public class FriendsNamesLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		String[] names=new String[3];
		int matches=0;
		for (int counter=0; counter<names.length; counter++){
		System.out.println("Friend "+(counter+1)+":");
		names[counter]=input.nextLine();
			}
		System.out.println("Desired length:");
		 int desiredLength=input.nextInt();
	for (int counter2=0; counter2<names.length; counter2++){
int length=names[counter2].length();
if (length==desiredLength){
	matches++;}
System.out.println(matches+" have friends with a name that is the desired length");
}
}
}