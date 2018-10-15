package objectOperators;

public class Numbers {

	public double returnSquare(double num)
	{
		double answer=num*num;
		return answer;
}
public double returnArea(double length, double width)
{
	return length*width;
}
	public int returnRoundUp(double value)
	{
	int answer=(int)Math.ceil(value);
	return answer;
	}
}


