package strings;
import java.util.Scanner;
public class CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Tell me about your day:");
String day=input.nextLine();
System.out.println("1st character: "+day.charAt(0));
System.out.println(" 3rd character: "+day.charAt(2));
System.out.println(" Entire Sentence: "+day);

	}

}
