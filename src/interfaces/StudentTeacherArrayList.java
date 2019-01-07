package interfaces;

import java.util.ArrayList;

public class StudentTeacherArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Person> school=new ArrayList <Person>();
		school.add(new Student());
		school.add(new Student());
		school.add(new Student());
		school.add(new Teacher());
		school.add(new Teacher());
		school.add(new Teacher());
		for(Person i:school){
			if(i instanceof Student){
				Student billy=(Student)i;
			billy.outSick();}
					System.out.println(i.getName());
}
}}