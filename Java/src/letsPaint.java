import java.util.Scanner;

public class letsPaint {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length = 0.0;
		double width = 0.0;
		double height = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the room?");
		length = input.nextDouble();
		System.out.println("What is the width of the room?");
		width = input.nextDouble();
		System.out.println("What is the height of the room?");
		height = input.nextDouble();
		double firstsetofwalls = length * height * 2;
		double secondsetofwalls = width * height * 2;
		double paintneeded = firstsetofwalls + secondsetofwalls;
		double gallonsneeded =(int)(paintneeded / 150);
		gallonsneeded++;
		System.out.println("You will need " + gallonsneeded + " gallons of paint.");
	}

}
