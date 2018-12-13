package arrays;
import java.util.Random;
public class TwoDimenFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator=new Random();
Friend[][] friends=new Friend[18][5];
for (int row=0; row<18; row++){
	for (int column=0; column<5; column++){
		Friend billy=new Friend();
		int randomNum=0+generator.nextInt(100-0+1);
		billy.setAge(randomNum);
		friends[row][column]=billy;
	}
}
for (int row=0; row<18; row++){
	for (int column=0; column<5; column++){
		System.out.print(friends[row][column].getAge()+" ");
	}
	System.out.println();
	}
	}
}
