package designingClasses;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class SATScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator=new Random();
Scanner input=new Scanner(System.in);
ArrayList <Integer> scores=new <Integer> ArrayList();
boolean answer=false;
for (int i=0; i<1000; i++){
	scores.add(400+generator.nextInt(1600-400+1));
}
System.out.println("SAT score?");
int num=input.nextInt();
for(int j:scores){
	if (j==num){
	answer=true;
	}
}
System.out.println("The score is in the Array List: "+answer);
	}

}
