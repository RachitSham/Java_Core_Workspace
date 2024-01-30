/*
*To Print the Left half Number pattern.
*/
public class LeftHalfNumberPattern
{
	public void test()
	{
		for(int i=4; i>=1; i--)
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
	//creating object for Left half Number pattern class.
		LeftHalfNumberPattern lhp = new LeftHalfNumberPattern();
		lhp.test();
	}
}