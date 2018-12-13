package arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> names=new ArrayList<String>();
Scanner input=new Scanner(System.in);
names.add("Bob");
names.add("Jane");
names.add(0,"Billy");
System.out.println("Name?");
names.add(input.nextLine());
	}

}
