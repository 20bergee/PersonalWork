package inputExamples;
import java.util.Scanner;
public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int dividend=0;
int divisor=0;
Scanner input=new Scanner(System.in);
System.out.println("Dividend:");
dividend=input.nextInt();
System.out.println("Divisor:");
divisor=input.nextInt();
int result=0;
result=dividend/divisor;
final char REMAINDER='r';
int remainder=0;
remainder=dividend%divisor;
System.out.println("The result is "+result+REMAINDER+remainder);
	}

}
