package designingClasses;
import java.util.Scanner;
public class TestPileOJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		System.out.println("Integer 1:");
		int one=input.nextInt();
		System.out.println("Integer 2");
		int two=input.nextInt();
pileOjunk junk=new pileOjunk();
junk.getSum(one,two);
junk.overwriteRandom(5);
	}

}
