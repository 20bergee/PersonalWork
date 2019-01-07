package interfaces;

public class TestSchool2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Teacher teacher=new Teacher();
Person somePerson=teacher;
Student student=new Student();
somePerson.setName("Mr. Osterberg");
teacher.payMe();
somePerson=student;
somePerson.setName("Lauren");
for(int i=0; i<3;i++){
student.outSick();}

	}

}
