package randomNumbers;
import java.util.Random;
public class FlipACoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator=new Random();
int counter=0;
int counter2=0;
int min=1;
int max=2;
double heads=0.0;
double highest=0.0;
double lowest=0.0;
for (counter2=1; counter2<=1000; counter2++){
	for (counter=1; counter<=1000; counter++){
		int randomNum=min+generator.nextInt(max-min+1);
		if (randomNum==1){
			heads++;}
		if ((heads/100000.0)>=highest) {
		highest=heads/100000.0;
		}
		if ((heads/100000.0)<=lowest){
			lowest=heads/100000.0;
		}
	}
}
System.out.println("Maximum percentage of heads: "+(highest*100)+" Minimum percentage of heads: "+(lowest*100));
	}

}
