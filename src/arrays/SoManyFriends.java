package arrays;
import java.util.Scanner;
public class SoManyFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Friend[] besties=new Friend[5];
		for(int i=0; i<besties.length; i++) {
			System.out.println("Friend's name: ");
			java.lang.String name=input.nextLine();
			System.out.println("Friend's age: ");
			int age=input.nextInt();
			Friend bff=new Friend(name,age);
			besties[i]=bff;
			input.nextLine();}
		for(int j=(besties.length-1); j>=0; j--) {
			System.out.println(besties[j].getName()+" is "+besties[j].getAge());;
		}

	}

}
