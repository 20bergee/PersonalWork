
public class Employee {
private double wage;
private int experience;
	public Employee()
	{
		wage=-999.9;
		experience=-999;
	}
	public double getWage(){
	return wage;
	}
	public void setWage(double userWage){
		wage=userWage;	
		}
	public double getExperience(){
		return experience;
	}
	public void setExperience(int userExperience){
		experience=userExperience;
	}
	public double getRaise(){
		return wage*1.10;
	}
}
