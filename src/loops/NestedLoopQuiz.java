package loops;

import java.util.Scanner;

public class NestedLoopQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int num=0;
		do {
		System.out.println("Positive Integer (999 to quit):");
		num = input.nextInt();
		for (int divisor = 2; divisor <= num; divisor += 2) {
			if (num % divisor == 0) {
				sum += divisor;
		}}}
		while (num!=999);
		System.out.println("Sum of even divisors: " + sum);
	}
}
		