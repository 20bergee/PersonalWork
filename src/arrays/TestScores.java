package arrays;
import java.util.Scanner;
public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	int index=0;
	int[] scores=new int[5];
for (int counter=1; counter<=5; counter++){
	System.out.println("Test Score "+counter+":");
	scores[index]=input.nextInt();
	index++;
}
System.out.println(scores[0]+","+scores[1]+","+scores[2]+","+scores[3]+","+scores[4]);
	}

}
