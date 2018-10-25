package loops;
import java.util.Scanner;
public class Productofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input=new Scanner(System.in);
System.out.println("Please enter a number:");
double number=input.nextDouble();
do{
System.out.println("Magic product is :"+number*17);
System.out.println("Please enter a number. (9999 to quit):");
number=input.nextInt();
	}while(number!=9999);
	}

}
