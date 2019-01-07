package interfaces;
import java.util.ArrayList;
public class CircleAndRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Shape> shapes=new ArrayList <Shape>();
Shape billy=new Circle(4.5);
Shape bob=new Circle(3.5);
Shape barb=new Circle(2.5);
Shape hewy=new Rectangle(4,5);
Shape lewy=new Rectangle(3,4);
Shape dewy=new Rectangle(2,3);
shapes.add(billy);
shapes.add(bob);
shapes.add(barb);
shapes.add(hewy);
shapes.add(lewy);
shapes.add(dewy);
double totalArea=0;
double smallPer=shapes.get(0).perimeter();
for (int i=0; i<shapes.size(); i++){
	totalArea+=shapes.get(i).area();
	if(smallPer>shapes.get(i).perimeter()){
		smallPer=shapes.get(i).perimeter();
	}
}
System.out.println(totalArea);
System.out.println("Smallest perimeter:"+smallPer);
	}

}
