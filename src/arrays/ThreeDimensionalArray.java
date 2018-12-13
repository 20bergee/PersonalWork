package arrays;
import java.util.Random;
public class ThreeDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator=new Random();
int total=0;
int[][][] array=new int[3][7][9];
for (int rows=0; rows<3; rows++){
	for (int columns=0; columns<7; columns++){
		for (int elements=0; elements<9; elements++){
			array[rows][columns][elements]=1+generator.nextInt(1-1+1);
			total+=array[rows][columns][elements];
		}
	}
}
System.out.println(total);
	}

}
