package decision;
import java.util.Scanner;
public class HowMuch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int menu=0;
Scanner input=new Scanner(System.in);
System.out.println("How much do you weigh?");
int weight=input.nextInt();
switch(menu)
{
case 1:
	double mercury=weight*0.37;
	break;
case 2:
	double venus=weight*0.88;
	break;
case 3:
	double mars=weight*0.38;
	break;
case 4:
	double jupiter=weight*2.64;
	break;
case 5:
	double saturn=weight*1.15;
	break;
	
	}
	}

}
