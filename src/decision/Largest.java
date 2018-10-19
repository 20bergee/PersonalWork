package decision;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("First:");
		int first=input.nextInt();
		System.out.println("Second:");
		int second=input.nextInt();
		System.out.println("Thirds: ");
		int third=input.nextInt();
if (first<second&&third<second)
{
	System.out.println(second+" is the biggest");
}
if (second<first&&third<first)
{
	System.out.println(first+" is the biggest");
}
if (first<third&&second<third)
{
	System.out.println(third+" is the biggest");
}
	}
}
