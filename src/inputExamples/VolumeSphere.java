package inputExamples;
import java.util.Scanner;
public class VolumeSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double radius=0.0;
Scanner input=new Scanner(System.in);
System.out.println("What is the radius of a sphere?");
radius=input.nextDouble();
double volume=0.0;
volume=(4.0/3.0)*3.14*(radius*radius*radius);
System.out.println("The volume is "+volume);
	}

}
