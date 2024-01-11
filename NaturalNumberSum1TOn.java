import java.util.*;
/*
*To find sum of all natural numbers between 1 to n.
*/
class NaturalNumberSum1TOn
{
	/*
	*this method is used to sum all natural number between 1 to 100
	*@Parameter :[n] is used from where you want to sum of natural numbers.
	*@return : no return type
	*/
	public void num(int n)
	{
		int sum = 0;
		for(int i=1; i<=n; i++)	
		{
			sum = sum + i;
		}
		System.out.println("Natural Number Sum :-"+sum);
	}
	public static void main(String[] args)
	{
		// creating scanner class to read input from the keyboard. 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter The Natural Numbers :-");
		int n = sc.nextInt();
		
		// creating NaturalNumberSum1TOn object to call num method.
		NaturalNumberSum1TOn sn1 = new NaturalNumberSum1TOn();
		sn1.num(n);
	}
}