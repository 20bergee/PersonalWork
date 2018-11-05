package randomNumbers;
import java.util.Random;
public class dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Random generator=new Random();
	int min=1;
	int max=2;
		int head=0;
		int tails=0;
		int counter=0;
for (counter=1; counter<=100000; counter++){
	int randomNum=min+generator.nextInt(max-min+1);
	if (randomNum==1){
		head++;}
	if (randomNum==2){
		tails++;}
	}
System.out.println("Heads: "+head+" Tails: "+tails);
}
	}

