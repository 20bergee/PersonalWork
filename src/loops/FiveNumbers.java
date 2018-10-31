package loops;
import java.util.Scanner;
public class FiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
int count=0;
int total=0;
for (count=1; count<=5; count++){
	System.out.println("Enter a number:");
	int number=input.nextInt();
	total+=number;
}
System.out.println(total);
	}

}
