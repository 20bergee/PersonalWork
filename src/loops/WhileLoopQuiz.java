package loops;
import java.util.Scanner;
public class WhileLoopQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
int counter=0;
System.out.println("Pick a random number (0-1000):");
int num=input.nextInt();
counter++;
while(num<444){
	System.out.println("Your number is too low");
	System.out.println("Pick a random number (0-1000):");
	num=input.nextInt();
	counter++;
}
while(num>444){
	System.out.println("Your number is too high");
	System.out.println("Pick a random number (0-1000):");
	num=input.nextInt();
	counter++;
}
System.out.println(counter+" attempts");
	}
}
 