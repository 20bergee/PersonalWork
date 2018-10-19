
public class Circle {
	//instance field
private double radius;
//Default constructor
public Circle(){
	radius=-999.9;
}
//Alternate constructor
public Circle(double newRadius)
{
	radius=newRadius;
}
//Mutator methods
public void setRadius(double newRadius){
if (newRadius>0.0){
	radius=newRadius;}
radius=10;}
//Accessor methods
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

