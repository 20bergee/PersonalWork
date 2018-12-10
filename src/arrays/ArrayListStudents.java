package arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> students=new <String> ArrayList();
Scanner input=new Scanner(System.in);
System.out.println("How many students?");
int numStudents=input.nextInt();
input.nextLine();
for (int i=0; i<numStudents; i++){
	System.out.println("Student "+(i+1)+":");
	String student=input.nextLine();
	students.add(student);
}
students.remove(0);
students.remove(students.size()-1);
for (int i=0; i<students.size(); i++){
	System.out.println(students.get(i));
}
	}

}
