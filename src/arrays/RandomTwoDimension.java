package arrays;
import java.util.Random;
public class RandomTwoDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator=new Random();
int[][] random=new int[14][9];
int min=1;
int max=100;
for(int row=0; row<14; row++){
	for (int column=0; column<9; column++){
		random[row][column]=min+generator.nextInt(max-min+1);
		}
}
for(int row=0; row<14; row++){
	for (int column=0; column<9; column++){
System.out.print(random[row][column]+" ");
}
System.out.println();
	}
	}
}
