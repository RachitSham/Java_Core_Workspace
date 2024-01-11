import java.util.*;
/*
*To calculate the circle diameter.
*/
public class CircleDiameter
{
	/*
	*this method is used to calculate the circle diameter.
	*@Parameter : [r] is used for radius of circle.
	*@return: no return type.
	*/
	public void diameter(int r)
	{
		int d = 2 * r;
		System.out.println(d);
	}
	public static void main(String[] args)
	{
	// creating CircleDiameter object to call diameter method.
	
		CircleDiameter cd1 = new CircleDiameter();
		cd1.diameter(60);
	}
}