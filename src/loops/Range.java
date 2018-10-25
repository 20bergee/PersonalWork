package loops;
import java.util.Scanner;
public class Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number=0.0;
		double largest=0.0;
		double smallest=0.0;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number:");
		number=input.nextInt();
		do{
			if (number>largest){  
				largest=number;}
				if (number<smallest){
					smallest=number;
				}}
		while (number!=9999);{
			System.out.println("Please enter a number. (9999 to quit):");
			number=input.nextInt();
			}
		System.out.println("The range is "+(largest-smallest));
			}}
