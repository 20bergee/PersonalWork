package inputExamples;
import java.util.Scanner;
public class SpeedLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int speedlimit=0;
int speedofdriver=0;
Scanner input=new Scanner(System.in);
System.out.println("What is the speed limit?");
speedlimit=input.nextInt();
System.out.println("What is the speed of the driver?");
speedofdriver=input.nextInt();
int milesover=speedofdriver%speedlimit;
milesover--;
int fine=(55+(milesover*40));
System.out.println("Speed limit: "+speedlimit);
System.out.println("Driver's speed: "+speedofdriver);
System.out.println("Cost of ticket: "+fine);
	}

}
