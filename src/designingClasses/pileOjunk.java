package designingClasses;
import java.util.Random;
public class pileOjunk {
public static int id=100;
private int myId;
private int random;
public pileOjunk(){
	Random generator=new Random();
	random=10+generator.nextInt(100-10+1);
	myId=id;
	id+=2;
}
public static int getSum(int xInt, int yInt){
	return xInt+yInt;}


public void overwriteRandom(int random){
	this.random=random;
}

}
