
public class IsoscelesTrapezoid {
//instance fields
	double base1;
	double base2;
	double height;
	double leg;
	public IsoscelesTrapezoid(){
		base1=-999.9;
		base2=-999.9;
		height=-999.9;
		leg=-999.9;
	}
	public IsoscelesTrapezoid(double base1,double base2,double height,double leg){
	}
	public double perimeter(){
		return base1+base2+height+leg+leg;
	}
	public double area(){
		return (base1+base2+height)/2;
	}
}
