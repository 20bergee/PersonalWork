package loops;
import java.util.Scanner;
public class ClassAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
int counter=0;
double sum=0.0;
System.out.println("How many students are in the class?");
int students=input.nextInt();
for (counter=1;counter<=students; counter++){
System.out.println("Student "+counter+"'s test score:");
double grade=input.nextDouble();
sum+=grade;
}
System.out.println("The class average is "+(sum/students));
	}

}
