package strings;
import java.util.Scanner;
public class TestEssay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Essay pap=new Essay();
System.out.println("First and Last Name:");
String name=input.nextLine();
System.out.println("Essay:");
String text=input.nextLine();
pap.setName(name);
pap.setText(text);
System.out.println(pap.getLastName());
System.out.println(pap.getCharacters());
System.out.println(pap.predicate());
System.out.println(pap.words());
	}

}
