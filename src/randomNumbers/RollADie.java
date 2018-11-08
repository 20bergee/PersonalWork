package randomNumbers;
import java.util.Random;
import java.util.Scanner;
public class RollADie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int min=1;
int counter=0;
int randomNum=0;
Scanner input=new Scanner(System.in);
Random generator=new Random();
System.out.println("How many sides are on the die?");
int max=input.nextInt();
if (max<0){
	max=1;}
System.out.println("How many rolls?");
int rolls=input.nextInt();
for (counter=1; counter<=rolls; counter++){
	randomNum=min+generator.nextInt(max-min+1);
	System.out.println(randomNum);
}

	}


}
