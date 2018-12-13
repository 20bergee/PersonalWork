package arrays;
import java.util.Random;
import java.util.ArrayList;
public class FourHundredRectangleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator=new Random();
ArrayList <Rectangle> rectangles=new <Rectangle> ArrayList();
for (int i=0; i<400; i++){
	int randomNum=50+generator.nextInt(70-50+1);
	Rectangle myboi=new Rectangle(randomNum,randomNum);
	rectangles.add(i,myboi);
}
Rectangle junk=rectangles.remove(399);
rectangles.set(0, junk);
for (int i=rectangles.size()-1; i>=0; i--){
	System.out.println(rectangles.get(i).area());
}
	}

}
