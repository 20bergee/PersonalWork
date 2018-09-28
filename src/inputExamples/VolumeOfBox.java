package inputExamples;
import java.util.Scanner;
public class VolumeOfBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double length=0.0;
double width=0.0;
double height=0.0;
Scanner input=new Scanner(System.in);
System.out.println("Length:");
length=input.nextDouble();
System.out.println("Width:");
width=input.nextDouble();
System.out.println("Height:");
height=input.nextDouble();
double volume=0.0;
volume=length*width*height;
System.out.println("The volume is "+volume);
		
	}

}
