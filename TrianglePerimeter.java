import java.util.*;
/*
*To calculate the Triangle Perimeter.
*/
public class TrianglePerimeter
{
	/*
	*this method is used to calculate the Triangle Perimeter.
	*@Parameter :[a] is used for side , and [b] is used for base , [c] is alse used for side.
	*@Return : no return type.
	*/
	public void perimeter(int a,int b,int c)
	{
		int p = a + b + c;
		System.out.println(p);
	}
	public static void main(String[] args)
	{
	// creating Triangle Perimeter object to call perimeter method.
	
		TrianglePerimeter tp1 = new TrianglePerimeter();
		tp1.perimeter(19,20,30);
	}
}