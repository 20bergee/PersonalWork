package strings;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input=new Scanner(System.in);
System.out.println("Enter Word:");
String word=input.nextLine();
int index=0;
int index2=0;
for (index=0; index<word.length(); index++){
	for (index2=word.length(); index2>=0; index2--){
		char letter=word.charAt(index);
		char letter2=word.charAt(index2);
		if (letter==letter2){
			System.out.println("Palindrome!");
		}
	}
}
	}

}
