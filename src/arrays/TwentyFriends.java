package arrays;
import java.util.Scanner;
public class TwentyFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner (System.in);
String[] names=new String[20];
for (int counter=0; counter<names.length; counter++){
System.out.println("Friend "+(counter+1)+":");
names[counter]=input.nextLine();
	}
for (int counter2=(names.length-1); counter2>=0; counter2--){
	System.out.println(names[counter2]);
}
}
}
