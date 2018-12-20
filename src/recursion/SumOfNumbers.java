package recursion;
import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Integer:");
int num=input.nextInt();
System.out.println(sum(num));
	}
public static int sum(int xNum){
	int total=0;
if (xNum>0)	{
total=xNum+sum(xNum-1);
}
return total;
}}

