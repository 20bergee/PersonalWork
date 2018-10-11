
public class Circle {
	//instance field
private double radius;
//constructor
public Circle(){
	radius=-999.9;
}
public Circle(double newRadius)
{
	radius=newRadius;
}
//Mutator methods
public void setRadius(double newRadius)
{
	radius=newRadius;
}
public double getRadius(){
return radius;
}
public double circumference(){
	double circu=2.0*Math.PI*radius;
	return circu;
}
public double area(){
	double are=Math.PI*Math.pow(radius, 2);
	return are;
}}

