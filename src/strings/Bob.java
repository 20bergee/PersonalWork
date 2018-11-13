package strings;
import java.util.Scanner;
class Bob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Who is your best friend?");
String bff=input.nextLine();
System.out.println("The sentence contains Bob:" +bff.contains("bob"));
	}

}

