
public class TestCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat bill=new Cat();
		System.out.println("how old is cat?");
		bill.setAge(7);
		System.out.println("Cat will turn "+bill.birthday()+" on October 11th");
		System.out.println("How many hours of sleep does cat get"); 
		bill.setSleep(8);
		System.out.println("Cat should get "+bill.sleepMore()+" hours of sleep not "+bill.sleepLess()+" hours");

	}

}
