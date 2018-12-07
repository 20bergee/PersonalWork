package arrays;
import java.util.ArrayList;
import java.util.Random;
public class RectangleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largest=0;
		int smallest=2500;
ArrayList <Rectangle> rectangles=new <Rectangle> ArrayList();
Random generator=new Random();
for (int object=0; object<20; object++){
	Rectangle rectangle=new Rectangle(1+generator.nextInt(50-1+1),1+generator.nextInt(50-1+1));
if (rectangle.area()>largest){
	rectangles.add(0,rectangle);
}
if(rectangle.area()<smallest){
	rectangles.add(18,rectangle);
}
}
for (int object2=0; object2<20; object2++){
	System.out.print(rectangles+" ");
}
System.out.println();
	}

}
