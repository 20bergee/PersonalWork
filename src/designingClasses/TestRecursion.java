package designingClasses;

public class TestRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sumNumbers(10));
	}

	public static int sumNumbers(int num){
		if (num>1){
		return num+sumNumbers(num-1);
	}
		return 0;}
}
