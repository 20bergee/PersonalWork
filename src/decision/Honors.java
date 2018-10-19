package decision;
import java.util.Scanner;
public class Honors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter you GPA");
		double gpa=input.nextDouble();
		System.out.println("Enter you grade");
		int answer=input.nextInt();
		if (gpa>3.50&&answer==12){
			System.out.println("You will graduate with honors!");
		}
		else{
			System.out.println("You will not graduate with honors:(");
		}
	}

}
