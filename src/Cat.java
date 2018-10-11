
public class Cat {
	//instance fields
	private int age;
	private int sleep;
	//constructors
	public Cat()
	{
	age=-999;
	sleep=-999;
	}
	public Cat(int enteredAge){
	}
	//Mutator methods
	public void setAge(int enteredAge)
	{
	age=enteredAge;
	}
public void setSleep(int enteredSleep)
	{
	sleep=enteredSleep;
	}
	//Accessor Methods
	public int birthday(){
	return age+1;
	}
	public int sleepMore(){
	return sleep+1;
	}
	public int sleepLess(){
	return sleep-1;
	}

}
