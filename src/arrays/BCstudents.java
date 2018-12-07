package arrays;
import java.util.Scanner;
public class BCstudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("How many students?");
int numStudents=input.nextInt();
input.nextLine();
int total=0;
String[][] students=new String[numStudents][2];
for(int row=0; row<numStudents; row++){
	System.out.println("Name");
	String name=input.nextLine();
	String firstname=name.substring(0,name.indexOf(" "));
	students[row][0]=name.substring(0,name.indexOf(" "));
	students[row][1]=name.substring(name.indexOf(" ")+1,name.length());
	total+=firstname.length();
}
System.out.println("The average length of the first name is: "+(total/numStudents));
for(int row=0; row<numStudents; row++){
	System.out.println(students[row][1]+","+students[row][0]);
	}
}

}
