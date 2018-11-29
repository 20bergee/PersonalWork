package arrays;

import java.util.Scanner;
import java.util.Random;

public class RandomWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		System.out.println("Sentence: ");
		String sentence = input.nextLine();
		String[] words = sentence.split[" "];
		for (int i = 0; i < words.length; i++) {
			int randomNum = 0 + generator.nextInt(0 + words.length - 1);
			words[randomNum] = "WatsUp";
			System.out.println(words[i]);
		}

	}

}
