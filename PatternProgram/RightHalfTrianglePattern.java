/*
*To Print the Right Half triangle pattern.
*/
public class RightHalfTrianglePattern
{
	//creating rightHalf method.
	public void rightHalf()
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" * ");
			}
			System.out.println( );
		}
	}
	public static void main(String[] args)
	{
	// creating object for Right Half triangle class.
		RightHalfTrianglePattern rht = new RightHalfTrianglePattern();
		rht.rightHalf();
	}
}