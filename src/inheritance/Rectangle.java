package inheritance;

public class Rectangle extends Parallelogram{
public Rectangle(){
super();
}
public Rectangle(double length, double width){
 super(length, width, width);
}
public double area(){
 return super.getS1()*super.getS2();
}
}