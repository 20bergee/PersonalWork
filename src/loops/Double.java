package loops;
import java.util.Scanner;
public class Double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=0;
int sum=0;
double average=0.0;
int enter=0;
Scanner input=new Scanner(System.in);
System.out.println("Please enter a number. (9999 to quit):");
number=input.nextInt();
while(number!=9999)
{
	sum=sum+number;
	enter ++;
	average=sum/enter;
	System.out.println("Please enter a number. (9999 to quit):");
	number=input.nextInt();
}
System.out.println("The average of the numbers entered is:"+average);
}
}

