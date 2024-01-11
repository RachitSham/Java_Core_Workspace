/*
*to Calculate the Simple Interest.
*/
public class SimpleInterestTest
{
	/*
	*this method is used to calculate the simple interest.
	*@Parameter : [p] is used for principle , and [r] is used for rate of interest , and [t] is used for time period.
	*@Return : no return type.
	*/
	public void interest(int p , int r , int t)
	{
		int a = p*(1 + r + t);
		System.out.println(a);
	}
	public static void main(String[] args)
	{
	// creating SimpleInterestTest object to call interest method.
		SimpleInterestTest si1 = new SimpleInterestTest();
		si1.interest(4000 , 4 , 3);
	}
}