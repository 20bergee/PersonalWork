package arrays;
import java.util.Scanner;
public class PlaygroundResearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
Double[][] heights=new Double[4][3];
double total=0.0;
double tallest=0.0;
double numStudents=0.0;
for(int i=0; i<heights.length;i++){
	for(int j=0; j<heights[0].length;j++){
		System.out.println("Height of student:");
		double height=input.nextDouble();
		heights[i][j]=height;
	}
}
double shortest=heights[0][0];
for (int i=0; i<heights.length; i++){
	for(int j=0; j<heights[0].length; j++){
total+=heights[i][j];
if (heights[i][j]>tallest){
	tallest=heights[i][j];
}
if (heights[i][j]<shortest&&heights[i][j]!=0){
	shortest=heights[i][j];
}
if (heights[i][j]!=0){
	numStudents+=1.0;
}
	}
}
System.out.println("Average height: "+(total/numStudents)+" inches");
System.out.println("Tallest student: "+tallest+" inches");
System.out.println("Shortest student: "+shortest+" inches");
	}

}
