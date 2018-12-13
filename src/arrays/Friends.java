package arrays;
import java.util.Scanner;
public class Friends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Number of friends:");
		int numFriends=input.nextInt();
		input.nextLine();
		String[] friends=new String[numFriends];
		for (int i=0; i<friends.length; i++) {
			System.out.println("Friend first and last name:");
			String name=input.nextLine();
			friends[i]=name;}
	int longest=0;
	int longestI=0;
	int shortest=friends[0].length();
	int shortestI=0;
	for (int j=0; j<friends.length; j++){

		if(friends[j].length()>longest) {
			longest=friends[j].length()-1;
			longestI=j;
			}
			if(friends[j].length()<shortest){
			shortest=friends[j].length()-1;
			shortestI=j;
			}
			System.out.println(friends[j]);}
		
		System.out.println("Longest Name: "+friends[longestI]+" Shortest Name: "+friends[shortestI]+" Range of lengths: "+(longest-shortest));

	}

	}
