package inputExamples;
import java.util.Scanner;
public class Ssn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=0;
int ssn=123456789;
Scanner input=new Scanner(System.in);
System.out.println("Age:");
age=input.nextInt();
System.out.println("SSN:");
ssn=input.nextInt();
int lastfourdigits=ssn%10000;
int yearsuntil18=18-age;
System.out.println("Age: "+age);
System.out.println("Years until 18: "+yearsuntil18);
System.out.println("SSN: "+ssn);
System.out.println("Last four digits of SSN: "+lastfourdigits);
	}

}
