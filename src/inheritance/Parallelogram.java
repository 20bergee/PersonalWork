package inheritance;

public class Parallelogram extends Quadrilateral{
	private double height;
public Parallelogram(){
	super();
	height=2;
}
public Parallelogram(double xBase, double xHeight, double xSide){
super(xBase, xSide, xBase, xSide);
height=2;
}
public double area(){
	return super.getSide1()*height;
}
public String toString(){
	return "Parallelogram - Sides: "+super.toString()+" Height: "+height;
}
public Object clone(){
	return new Parallelogram(super.getSide1(), super.getSide2(), height);
}
public boolean equals(Object xObject){
	return this.toString().equals(xObject);
}
}
