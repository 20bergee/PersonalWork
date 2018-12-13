package arrays;
import java.util.Scanner;
public class ForEachLoopStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner (System.in);
System.out.println("How many students are in the class?");
int size=input.nextInt();
int total=0;
int[] ages=new int[size];
for(int j=0; j<size; j++){
	System.out.println("Age of student "+(j+1)+":");
	ages[j]=input.nextInt();
}
for (int y:ages){
	total+=y;
}
System.out.println("Average age of students: "+(total/(double)size));
	}

}
