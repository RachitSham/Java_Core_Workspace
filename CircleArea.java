/*
*To calculate the area of circle.
*/
public class CircleArea
{	
	/*
	*this method is used to calculate the area of circle
	*@Parameter : [r] is used for radius of circle.
	*@Return : no return type.
	*/
	final static double pi = 3.14;
	public void area(double r)
	{
		double a = pi * r*r;
		System.out.println(a);
	}
	public static void main(String[] args)
	{
	// creating CircleArea object to call area method.
	
		CircleArea ca1 = new CircleArea();
		ca1.area(24);
	}
}