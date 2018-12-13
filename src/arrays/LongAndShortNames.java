package arrays;
import java.util.Scanner;
public class LongAndShortNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("How many people do you know?");
int size=input.nextInt();
String[] people=new String[size];
String longestName="Hello";
String shortestName="Hello";
for(int index=0; index<people.length; index++){
	System.out.println("Name of Friend "+(index+1)+": ");
	people[index]=input.nextLine();
	int space=people[index].charAt(' ');
	
}
	}

}
