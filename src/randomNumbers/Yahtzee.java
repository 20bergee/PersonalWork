package randomNumbers;
import java.util.Random;
public class Yahtzee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator=new Random();
int min=1;
int max=6;
int roll=0;
int rollcount=0;
int num=0;
int six=0;
int five=0;
int four=0;
int three=0;
int two=0;
int one=0;
int yahtzee=0;
do {
for (roll=1; roll<=5; roll++){
	int randomNum=min+generator.nextInt(max-min+1);
	if (randomNum==1){
		one++;}
	if (randomNum==2){
		two++;}
	if (randomNum==3){
		three++;}
	if (randomNum==4){
		four++;}
	if (randomNum==5){
		five++;}
	if (randomNum==6){
		six++;}
	}
if (one==5 || two==5 || three==5 || four==5 || five==5 || six==5){
	System.out.println("Yahtzee!!");
	yahtzee=1;
	rollcount++;}
else{
	System.out.println("Roll again");
	rollcount++;
	}
}
while (yahtzee!=1);
System.out.println(rollcount+" rolls");
	}
}

