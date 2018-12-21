package designingClasses;
import java.util.ArrayList;
public class Student {
private String name;
private ArrayList <Integer> tests;
private int howMany;
public Student(){
	name="Bob";
	tests=new ArrayList<Integer>();
			for(int i=0; i<5;i++){
	tests.add(50);}
	howMany=5;
}
public Student(String xName){
name=xName;	
}
public void addaScore(int xScore){
	if (xScore<0){
		xScore=50;
	}
	tests.add(xScore);
	howMany++;
}
public double averageScore(){
	double total=0;
	for(int i=0; i<tests.size(); i++){
		total+=(double)tests.get(i);
	}
	double average=total/(double)tests.size();
	return average;
}
public int lowestScore(){
	int lowest=100;
	for (int i=0; i<tests.size(); i++){
		if (tests.get(i)<lowest){
			lowest=tests.get(i);
		}
	}
	return lowest;
}
public String toString(){
	return ("The Student "+name+" has taken "+howMany+" tests");
}
public Object clone(){
	return new Student(name);
}
public boolean equals(Object xObject){
	return this.toString().equals(xObject.toString());
}

}
