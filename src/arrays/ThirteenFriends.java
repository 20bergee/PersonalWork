package arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class ThirteenFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
ArrayList <Friend> ages=new <Friend> ArrayList();
for(int j=0; j<3; j++){
	System.out.println("Age of friend #"+(j+1)+":");
	int age=input.nextInt();
	input.nextLine();
System.out.println("Name of friend #"+(j+1)+":");
String name=input.nextLine();
Friend bestie=new Friend(name,age);
ages.add(bestie);
}
for (int i=ages.size()-1; i>=0;i--){
	System.out.println(ages.get(i).getName()+" has "+(65-ages.get(i).getAge())+" years until retirement");
}
	}

}
