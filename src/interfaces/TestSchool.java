package interfaces;

public class TestSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person mrO=new Teacher();
System.out.println(mrO.getName()+" "+mrO.getAge());
mrO=new Student();
System.out.println(mrO.getName()+" "+mrO.getAge());
	}

}
