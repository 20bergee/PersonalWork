package decision;
import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Outdoor temperature:");
		double temp=input.nextDouble();
if (temp>83)
{
	System.out.println("Swimming");
}
else{
if (temp>74)
{
	System.out.println("Tennis");
}
else{
if (temp>35)
{
	System.out.println("Golf");
}
else{
if (temp>-10)
{
	System.out.println("Snow Shoeing");
}
else
{
	System.out.println("Nothing");
}
	}

}}}}
