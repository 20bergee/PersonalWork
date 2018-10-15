
public class TestIsoscelesTrapezoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IsoscelesTrapezoid trappyz=new IsoscelesTrapezoid();
trappyz.setbase1(5);
System.out.println(trappyz.getb1());
trappyz.setbase2(3);
System.out.println(trappyz.getb2());
trappyz.setheight(2);
System.out.println(trappyz.geth());
trappyz.setleg(3);
System.out.println(trappyz.getl());
System.out.println("The perimeter of the trapezoid is "+trappyz.perimeter()+" the area of trapezoid is "+trappyz.area());
	}

}
