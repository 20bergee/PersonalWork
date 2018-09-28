package inputExamples;
import java.util.Scanner;
public class MoreCuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final double RATEOFPAY=12.00;
double lengthoflawn=0.0;
double widthoflawn=0;
double widthofmower=0;
int speed=0;
Scanner input=new Scanner(System.in);
System.out.println("What is the length of the lawn?");
lengthoflawn=input.nextDouble();
System.out.println("What is the width of the lawn?");
widthoflawn=input.nextDouble();
System.out.println("What is the width of the mower platform?");
widthofmower=input.nextDouble();
System.out.println("What is the speed of the lawn mower?");
speed=input.nextInt();
double areaoflawn=((lengthoflawn*widthoflawn)/5280);
double feetwidth=widthofmower/12;
double mileswidth=feetwidth/5280;
double areaformower=areaoflawn/mileswidth;
double howlong=speed*areaformower;
double cost=howlong*RATEOFPAY;
System.out.println("It will take "+howlong+" hours to mow the lawn and cost $"+cost);




	}

}
