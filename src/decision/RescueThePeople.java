package decision;
import java.util.Scanner;
public class RescueThePeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("How many people need to be saved?");
		int people=input.nextInt();
		System.out.println(people/10+" helicopters will be needed");
if ((people%10)==0){
	System.out.println("Mission was a success!");
}
else{
	System.out.println(people%10+" people will not survive");
}
	}

}
