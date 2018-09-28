import java.util.Scanner;
public class MakeSomeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double amountgiven=0.0;
Scanner input=new Scanner(System.in);
System.out.println("How much money do you have?");
amountgiven=input.nextDouble();
int dollars=((int)amountgiven/1);
double afterdollars=(amountgiven%1.00);
double quarters=(afterdollars/0.25);
double afterquarters=(afterdollars%0.25);
double dimes=(afterquarters%0.1);
double nickels=(dimes%0.05);
double pennies=(nickels%0.01);
System.out.println("You will need "+dollars+" dollars "+quarters+ " quarters "+dimes+" dimes "+nickels+" nickels and "+pennies+" pennies.");
	}

}
