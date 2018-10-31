package loops;
import java.util.Scanner;
public class LargeSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
double largest=0.0;
double smallest=100.0;
System.out.println("Enter your test score (9999 for largest):");
double score=input.nextDouble();
while (score!=9999){
if (score>largest){
largest=score;
}
if (score<smallest){
smallest=score;
}
System.out.println("Enter your test score (9999 for largest):");
score=input.nextDouble();
}
System.out.println("Smallest: "+smallest+" Largest: "+largest);
}
}

