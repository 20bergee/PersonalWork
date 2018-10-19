package decision;
import java.util.Scanner;
public class HeightAndShoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter your height");
double height=input.nextDouble();
System.out.println("Enter your shoe size");
double shoe=input.nextDouble();
System.out.println(height<26&&shoe>9);
	}

}
