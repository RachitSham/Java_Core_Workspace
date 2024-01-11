import java.util.*;
/*
*To calculate the circle of circumfrence.
*/
public class CircleCircumfrence
{
	/*
	*This Method is used to calculate the circle of circumfrence.
	*@Parameter : [r] is used for radius of circle.
	*@Return : no return type.
	*/
	static final double pi = 3.14;
	public void circumfrence(double r)
	{
		double c = 2 * pi * r;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
	// creating CircleCircumfrence object to call Circumfrence method.
	
		CircleCircumfrence cc1 = new CircleCircumfrence();
		cc1.circumfrence(18);
	}
}