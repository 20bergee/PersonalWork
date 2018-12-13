package strings;
import java.util.Scanner;
public class TwoNamesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Name:");
String name1=input.next();
System.out.println("Name:");
String name2=input.next();
if (name1.compareToIgnoreCase(name2)<0){
	System.out.println(name1.toUpperCase());
}
else {
	System.out.println(name2.toUpperCase());
}
	}

}
