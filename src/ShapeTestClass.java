import java.util.Scanner;
public class ShapeTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
Rectangle rex=new Rectangle();
System.out.println("Length of Rectangle:");
rex.setLength(input.nextDouble());
System.out.println("Width of Rectangle:");
rex.setWidth(input.nextDouble());
System.out.println(rex.perimeter());
	}

}
