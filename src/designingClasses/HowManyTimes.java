package designingClasses;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HowManyTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator=new Random();
		Scanner input=new Scanner(System.in);
		ArrayList <Integer> scores=new <Integer> ArrayList();
		int answer=0;
		for (int i=0; i<100; i++){
			scores.add(0+generator.nextInt(499-0+1));
		}
		System.out.println("Integer?");
		int num=input.nextInt();
		for(int j:scores){
			if (j==num){
			answer++;
			}
		}
		System.out.println("In the array "+answer+" time(s)");
	}

}
