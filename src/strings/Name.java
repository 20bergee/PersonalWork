package strings;
import java.util.Scanner;
public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input=new Scanner(System.in);
System.out.println("What is your age?");
int age=input.nextInt();
//clear the input buffer
input.nextLine();
System.out.println("What is your name?");
String name=input.nextLine();
System.out.println(name+" "+age);
	}

}
