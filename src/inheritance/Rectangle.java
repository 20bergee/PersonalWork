package inheritance;

public class Rectangle extends Parallelogram implements Geo{
public Rectangle(){
super();
}
public Rectangle(double length, double width){
 super(length, width, width);
}
public double area(){
 return super.getSide1()*super.getSide2();
}
public String toString(){
	return "Rectangle - Length: "+super.getSide1()+" Width: "+super.getSide2();
}
public boolean equals(Object xObject){
	return this.toString().equals(xObject);
}
public Object clone(){
	return new Rectangle (super.getSide1(), super.getSide2());
}
}