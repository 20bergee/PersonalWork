package randomNumbers;
import java.util.Random;
public class ThirteenDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator=new Random();
int counter=0;
int min=1;
int max=13;
int howMany=0;
for (counter=1; counter<=87; counter++){
int randomNum=min+generator.nextInt(max-min+1);
if (randomNum%3==0){
	howMany++;
}
}
System.out.println("A multiple of 3 was rolled "+howMany+" times");
	}

}
