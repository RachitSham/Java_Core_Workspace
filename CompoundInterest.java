/*
*Calculate the compound interest.
*/
public class CompoundInterest
{
	/*
	*This method is used to calculate the compound interest.
	*@Parameter : [p] is used for principle , and [r] is used for interest rate , and [t] is used for time ,and [n] is used for number of times interest applied per time period.
	*@Return : no return type.
	*/
	public void amount(double p , double r, double t , double n)
	{
		double ci = p * (1 + r/100)* n - t;
		System.out.println(ci);
	}
	public static void main(String[] args)
	{
	//creating object for Compound Interest class.
		CompoundInterest ci1 = new CompoundInterest();
		ci1.amount(20000,4.5,6,2);
	}
}