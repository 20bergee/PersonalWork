package objectOperators;

public class Circle {
private double radius;
public Circle(){
radius=0.0;
}
public Circle(double xradius){
radius=xradius;
}
public double getRadius(){
	return radius;
}
public double getCircumference(){
	return (2.0*3.14*radius);
}
public double getArea(){
	return (3.14*Math.pow(radius,2.0));
}
public void setRadius(double enteredRadius){
	radius=enteredRadius;
}
}
