import java.util.*;
/*
*To print sum of Integer from 1 to 10.
*/
class SumOfInteger
{
	public  int addinteger()
	{
		int sum = 0;
		for(int i=1; i<=10;i++)
		{
			sum = sum+i;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		// creating SumOfInteger object to call addinteger method.
		SumOfInteger si = new SumOfInteger();
		
		int a = si.addinteger();
		System.out.println(a);
	}
}