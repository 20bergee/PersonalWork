package strings;
import java.util.Scanner;
public class TwoNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("First Name:");
String first=input.next();
System.out.println("Second Name:");
String second=input.next();
if(first.compareTo(second)<0){
	System.out.println(first+" comes before "+second);
}
else 
	if (first.compareTo(second)>0){
		System.out.println(second+" comes before "+first);}
	else
		System.out.println("The names are the same,");
	}
	}

}
