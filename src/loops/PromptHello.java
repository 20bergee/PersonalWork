package loops;
import java.util.Scanner;
public class PromptHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("How many Hellos?");
		int howMany=input.nextInt();
		int counter=0;
		for (counter=1; counter<=howMany; counter=counter+1)
		{
			System.out.println(counter+" Hello");
		}
	}

}
