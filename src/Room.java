import java.util.Scanner;
public class Room {

	public Room()
	{
	}
	public void area()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("What is the length of the wall?");
		double length=input.nextDouble();
		System.out.println("What is the height of the wall?");
		double height=input.nextDouble();
		double area=length*height;
		System.out.println("The area of the wall is "+area);
	}
	public void areaWithDoor()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("What is the length of the wall?");
		double length=input.nextDouble();
		System.out.println("What is the height of the wall?");
		double height=input.nextDouble();
		double area=length*height;
		System.out.println("What is the length of the door?");
		double doorlength=input.nextDouble();
		System.out.println("What is the height of the door?");
		double doorheight=input.nextDouble();
		double doorarea=doorlength*doorheight;
		double finalarea=area-doorarea;
		System.out.println("The are of the wall, excluding the door, is "+finalarea);
	}
}
