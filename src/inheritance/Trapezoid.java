package inheritance;

public class Trapezoid extends Quadrilateral implements Geo{
	private double height;
	public Trapezoid(){
		super();
		height=2;
	}
	public Trapezoid(double xside1, double xside2, double xside3, double xside4){
		super(xside1,xside2,xside3,xside4);
	}
	public void setHeight(double newheight){
		height= newheight;
	}
	public double getHeight(){
		return height;
	}
	public double perimeter(){
		return super.perimeter();
	}
	public double area(){
		return (super.getSide1()+super.getSide3())/2*(height);
	}
	}

