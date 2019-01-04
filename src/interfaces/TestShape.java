package interfaces;
import java.util.Scanner;
public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Length of Rectangle:");
double length=input.nextDouble();
System.out.println("Width of Rectangle:");
double width=input.nextDouble();
Shape bob=new Rectangle(length,width);
System.out.println(bob.area()+" "+bob.perimeter());
	}

}
