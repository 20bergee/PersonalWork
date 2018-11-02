package loops;
import java.util.Scanner;
public class DivisorsInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
int counter=0;
int counter2=0;
int numDivisors=0;
int mostDivisors=0;
int numWithMostDivisors=0;
System.out.println("Positive Integer:");
int num=input.nextInt();
for (counter2=1; counter2<=num; counter2++){
for (counter=1; counter<=num; counter++){
	if ((counter2%counter)==0){
		numDivisors++;
	}
	if (numDivisors>mostDivisors){
		mostDivisors=numDivisors;
		numWithMostDivisors=counter2;
	}
}
	}
System.out.println(numWithMostDivisors+" has the most divisors");
}
}
