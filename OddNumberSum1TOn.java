import java.util.*;
/*
*To find sum of all odd numbers between 1 to n.
*/
class OddNumberSum1TOn
{
	/*
	*this method is used to sum all odd numbers between 1 to 100.
	*@Parameter :[n] is used from where you to sum of odd numbers.
	*@return : no return type.
	*/
	public void num(int n)
	{
		int sum = 0;
		for(int i=1; i<=n; i++)	
		{
			if(i%2==1)
			{
				sum = sum + i;
			}
		}
		System.out.println("odd Number Sum :-"+sum);
	}
	public static void main(String[] args)
	{
		// creating scanner class to read input from the keyboard. 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter The odd Numbers :-");
		int n = sc.nextInt();
		
		// creating OddNumberSum1TOn object to call num method.
		OddNumberSum1TOn od1 = new OddNumberSum1TOn();
		od1.num(n);
	}
}