package strings;
import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter Password:");
String password=input.nextLine();
boolean answer=false;
do {
	System.out.println("Verify Password:");
	String xpassword=input.nextLine();
	answer=password.equals(xpassword);
}
while (answer!=true);

	}

}
