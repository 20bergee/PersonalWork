package inheritance;

public class Rectangle extends Quadrilateral{
public Rectangle(){
this.setS1(3.0);
this.setS2(4.0);
this.setS3(3.0);
this.setS4(4.0);
}
public Rectangle(double xSide1, double xSide2, double xSide3, double xSide4){
this.setS1(xSide1);
this.setS2(xSide2);
this.setS3(xSide3);
this.setS4(xSide4);
}
public double area(){
	if (this.getS1()!=this.getS2()){
		return this.getS1()*this.getS2();
	}
	else{
		return this.getS1()*this.getS3();
	}
}
}