
public class Rectangle {
private double length;
private double width;
public Rectangle(){
	length=999.9;
	width=999.9;
}
	public void setWidth(double xwidth){
		width=xwidth;
	}
	public void setLength(double xLength){
		length=xLength;
	}
public double getLength()
{
	return length;
}
public double getWidth()
{
	return width;
}
public double perimeter()
{
	return 2*length+2*width;
}
public double area()
{
	return length*width;
}
}
