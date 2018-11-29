package arrays;
import java.util.Random;
public class OneHundredRectangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator=new Random();
Rectangle[] rectangles=new Rectangle[100];
int smallest=3136;
int smallestIndex=0;
for (int index=0; index<rectangles.length; index++){
int randomLength=10+generator.nextInt(10+56-1);
int randomWidth=10+generator.nextInt(10+56-1);
Rectangle rex=new Rectangle(randomLength, randomWidth);
rectangles[index]= rex;
if (smallest>rex.area()){
	smallest=rex.area();
	smallestIndex=index;
}
}
System.out.println("Smallest Area: "+rectangles[smallestIndex].area());
for (int index2=0; index2<smallestIndex; index2++){
	System.out.println("Area: "+rectangles[index2].area());
}
for (int index3=smallestIndex+1; index3<rectangles.length; index3++){
System.out.println("Area: "+rectangles[index3].area());
	}
	}
}
