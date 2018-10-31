package loops;

public class NestLoopsThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int divisor = 0;
		int numOfDivisors = 0;
		int largest = 0;
		int numWithLargest = 0;
		for (number = 1000; number >= 1; number = number - 1) {
			for (divisor = number; divisor >= 1; divisor = divisor - 1) {
				if (number % divisor == 0) {
					numOfDivisors++;
				}
			}
			if (numOfDivisors > largest) {
				largest = numOfDivisors;
				numWithLargest = number;
			}
			numOfDivisors = 0;
		}
		System.out.println(numWithLargest + " has " + largest + " divisors");
	}
}
