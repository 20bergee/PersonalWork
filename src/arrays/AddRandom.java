package arrays;
import java.util.Random;
public class AddRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator=new Random();
int[][] array=new int[3][7];
int total=0;
for (int column=0; column<7; column++){
	for (int row=0; row<3; row++){
		array[row][column]=0+generator.nextInt(100-0+1);
		total+=array[row][column];
	}
}
System.out.println(total);
	}

}
