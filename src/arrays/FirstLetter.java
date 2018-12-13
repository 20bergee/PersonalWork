package arrays;
import java.util.Scanner;
public class FirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Sentence: ");
String sentence=input.nextLine();
String[] words=sentence.split(" ");
for (int in=0; in<words.length; in++ ){
System.out.println(words[in].charAt(0));
}
	}

}
