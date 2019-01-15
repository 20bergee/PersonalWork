package inheritance;
import java.util.ArrayList;
public class TestGeo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Geo> recTrap=new ArrayList <Geo>();
for(int i=0; i<4; i++){
	recTrap.add(new Rectangle());
}
for(int i=0; i<4; i++){
	recTrap.add(new Trapezoid());
}
double largest=0.0;
String objectLarge="Rectangle";
for(Geo geo: recTrap){
	if(geo.area()>largest){
		largest=geo.area();
		if (geo instanceof Trapezoid){
			objectLarge="Trapezoid";
	}
}}
System.out.println("The largest object is a "+objectLarge+" with an area of "+largest);
	}}

