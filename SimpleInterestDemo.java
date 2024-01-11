/*
*To Calculate the Simple Interest.
*/
public class SimpleInterestDemo
{
	/*
	*This method is ued to calculate the Simple Interest.
	*@Parameter : [p] is used for princple, and [r] is used for rate of interest, [t] is used for time period.
	*
	*/
	public void princple(int p , int r, int t)
	{
		int si = (p * r * t)/100;
		System.out.println(si);
	}
	public static void main(String[] args)
	{
	//creating SimpleInterestDemo object to call princple method.
		SimpleInterestDemo st = new SimpleInterestDemo();
		st.princple(3000,8,6);
	}
}