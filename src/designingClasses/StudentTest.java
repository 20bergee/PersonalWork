package designingClasses;
import java.util.Scanner;
import java.util.ArrayList;
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
ArrayList <Student> manyStudents=new ArrayList <Student>(); 
System.out.println("How many students are there?");
int students=input.nextInt();
for (int i=0; i<students; i++){
System.out.println("Student's name:");
String name=input.nextLine();
Student stu1=new Student(name);
for(int j=0; i<5;i++){
System.out.println(name+" score "+(j+1)+":");
int score=input.nextInt();
stu1.addaScore(score);
	}
manyStudents.add(stu1);
}
for (int i=0; i<manyStudents.size(); i++){
System.out.println(manyStudents.get(i).averageScore()+" "+manyStudents.get(i).lowestScore());
}}}