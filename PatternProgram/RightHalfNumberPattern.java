/*
*To Print the Right Half Number.
*/
public class RightHalfNumberPattern
{
	public void demo()
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
				System.out.println();
		}
	}
	public static void main(String[] args)
	{
	// creating object for Right half Number class.
		RightHalfNumberPattern rhn = new RightHalfNumberPattern();
		rhn.demo();
	}
}