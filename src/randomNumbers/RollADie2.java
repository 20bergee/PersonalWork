package randomNumbers;
import java.util.Scanner;
import java.util.Random;
public class RollADie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
Random generator=new Random();
int min=1;
int max=6;
double rolls=0;
int counter=0;
double six=0;
double five=0;
double four=0;
double three=0;
double two=0;
double one=0;
System.out.println("How many rolls?");
rolls=input.nextDouble();
for (counter=1; counter<=rolls; counter++){
int randomNum=min+generator.nextInt(max-min+1);
if (randomNum==6){
	six++;}
if (randomNum==5){
	five++;}
if (randomNum==4){
	four++;}
if (randomNum==3){
	three++;}
if (randomNum==2){
	two++;}
if (randomNum==1){
	one++;}
}
System.out.println("number of 1's: "+one+" percentage of ones rolled: "+((one/rolls)*100.0));
System.out.println("number of 2's: "+two+" percentage of twos rolled: "+((two/rolls)*100.0));
System.out.println("number of 3's: "+three+" percentage of threes rolled: "+((three/rolls)*100.0));
System.out.println("number of 4's: "+four+" percentage of fours rolled: "+((four/rolls)*100.0));
System.out.println("number of 5's: "+five+" percentage of fives rolled: "+((five/rolls)*100.0));
System.out.println("number of 6's: "+six+" percentage of sixes rolled: "+((six/rolls)*100.0));
	}

}
