package arrays;

import java.util.Scanner;
import java.util.Random;
public class RandinScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	int index=0;
Random generator=new Random();
int randomNum=0+generator.nextInt(1000-0+1);
int[] scores=new int[250];
int largest=0;
for (int counter=1; counter<=250; counter++){
	scores[index]=randomNum;
	if (scores[index]>largest){
		largest=scores[index];
	}
	index++;
}
System.out.println(largest);
	}

}
