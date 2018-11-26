package arrays;

import java.util.Scanner;

public class TwentyFiveThousand {

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
for (int counter2=5-1; counter2>=0; counter2--){
	System.out.println(scores[counter2]);
}
	}

}
