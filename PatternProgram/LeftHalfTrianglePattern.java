/*
*To Print the Left Half Triangle Pattern.
*/
public class LeftHalfTrianglePattern
{
	public void leftHalf()
	{
		for(int i=4; i>=1;i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
	// creating object for left Half triangle pattern class.
		LeftHalfTrianglePattern lht = new LeftHalfTrianglePattern();
			lht.leftHalf();		
	}
}