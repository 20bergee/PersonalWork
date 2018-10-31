package loops;
import java.util.Scanner;
public class HowMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;
int counter=0;
Scanner input=new Scanner(System.in);
System.out.println("Number:");
int num=input.nextInt();
do {
sum+=num;
counter++;
System.out.println("Number:");
num=input.nextInt();
}
while (sum<=2018);
System.out.println(counter);
	}
	}
