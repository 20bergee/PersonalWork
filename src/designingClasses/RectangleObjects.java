package designingClasses;

import java.util.ArrayList;
import java.util.Random;
import arrays.Rectangle;

public class RectangleObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator=new Random();
		ArrayList <Rectangle> quads=new <Rectangle> ArrayList();
		int answer=0;
		for (int i=0; i<1000; i++){
			Rectangle rex=new Rectangle((0+generator.nextInt(499-0+1)),(0+generator.nextInt(499-0+1)));
			quads.add(rex);
		}
		for(Rectangle j:quads){
			if (j.getWidth()==10){
			answer++;
			}
		}
	System.out.println(answer);
	}
}
