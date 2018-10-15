
public class RightTriangle {
	//instance fields
	private double base;
	private double height;
	//constructors
	public RightTriangle(){
	base=4;
	height=3;
	}
	public RightTriangle(double base,double height){
	}
	public double hypot(){
	return Math.hypot(base,height);
	}
	public double perimeter(){
	return (base*2)+(height*2);
}
	public double area(){
		return (base*height)/2;
	}
}
