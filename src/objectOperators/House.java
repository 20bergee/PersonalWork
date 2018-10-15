package objectOperators;

import java.util.Scanner;

public class House {
	
	public House()
	{
	}
	public void sandbox()
	{
	Scanner input=new Scanner(System.in);
	System.out.println("length of the sandbox:");
	double length=input.nextDouble();
	System.out.println("width of the sandbox:");
	double width=input.nextDouble();
	System.out.println("depth of the sandbox:");
	double depth=input.nextDouble();
	System.out.println("Rate of transfer(cubic feet per hour):");
	double rate=input.nextDouble();
	}
}
