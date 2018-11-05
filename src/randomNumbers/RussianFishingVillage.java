package randomNumbers;
import java.util.Random;
public class RussianFishingVillage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator=new Random();
int min=26;
int max=43;
int counter=0;
int howMany=0;
for (counter=1; counter<=248; counter++){
	int randomNum=min+generator.nextInt(max-min+1);
	if (randomNum>36){
		howMany++;
	}
}
System.out.println(howMany+" first graders are taller then 3 feet");
	}

}
