// This Program Demonstrate to Logical NOT Operator..//

public class Logical_NOT_Demo
{
	public static void main(String[] args)
	{
	    int a = 6;
		int c = 45;
		
		boolean b = (!(a > 3 && c < 50));
		
		// returns false because 6 is greater than 3 OR 45 is also lesser than 50.
		
		System.out.println(b);
		
	}
}