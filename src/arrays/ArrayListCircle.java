package arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
ArrayList <Circle> radii=new ArrayList<Circle>();
for(int j=0; j<10; j++){
	System.out.println("Radius of circle "+(j+1)+":");
	Circle bob=new Circle(input.nextDouble());
	radii.add(bob);
}
for (Circle y:radii){
System.out.println(y.area());	
}
	}

}
