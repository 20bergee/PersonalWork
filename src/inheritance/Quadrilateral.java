package inheritance;

public class Quadrilateral {
private double side1;
private double side2;
private double side3;
private double side4;
public Quadrilateral(){
	side1=3;
	side2=4;
	side3=5;
	side4=6;
}
public Quadrilateral(double xSide1, double xSide2, double xSide3, double xSide4){
	side1=xSide1;
	side2=xSide2;
	side3=xSide3;
	side4=xSide4;
}
	public void setSide1(double xSide1){
		side1=xSide1;
	}
	public void setSide2(double xSide2){
		side2=xSide2;
	}
	public void setSide3(double xSide3){
		side3=xSide3;
	}
	public void setSide4(double xSide4){
		side4=xSide4;
	}
	public double getSide1 (){
		return side1;
	}
	public double getSide2(){
		return side2;
	}
	public double getSide3(){
		return side3;
	}
	public double getSide4(){
		return side4;
	}
public double perimeter(){
	return side1+side2+side3+side4;
}
public String toString(){
	return "Quadrilateral- Side 1: "+side1+" Side 2: "+side2+" Side 3: "+side3+" Side 4: "+side4;
}
public boolean equals (Object xObject){
	return this.toString().equals(xObject);
}
public Object clone(){
	return new Quadrilateral (side1, side2, side3, side4);
}
}
