package inheritance;

public class Auto {
private double odometer;
private double mPG;
public Auto(){
	odometer=0.0;
	mPG=30.0;
}
public Auto(double xOdometer, double xMPG){
	odometer=xOdometer;
	mPG=xMPG;
}
public double getOdometer(){
	return odometer;
}
public double getMPG(){
	return mPG;
}
public void drive (double xMiles){
	if (xMiles<0){
		xMiles=0;
	}
odometer+=xMiles;}
public String toString(){
	return "Auto Odometer: "+odometer+" miles MPG: "+mPG;
}
}
