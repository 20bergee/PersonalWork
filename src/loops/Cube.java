package loops;
import java.util.Scanner;
public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter an integer (-1 to quit):");
int num=input.nextInt();
while (num!=-1){
	int cubed=(num*num*num);
System.out.println(cubed);
System.out.println("Enter an integer (-1 to quit):");
num=input.nextInt();
}
	}

}
