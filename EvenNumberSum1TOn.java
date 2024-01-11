import java.util.*;
/*
*To find sum of all Even numbers between 1 to n.
*/
class EvenNumberSum1TOn
{
	/*
	*this method is used to sum all even numbers between 1 to 100
	*@Parameter :[n] is used from where you want to sum of Even numbers.
	*@return : no return type
	*/
	public void num(int n)
	{
		int sum = 0;
		for(int i=1; i<=n; i++)	
		{
			if(i%2==0)
			{
				sum = sum + i;
			}
		}
		System.out.println("Even Number Sum :-"+sum);
	}
	public static void main(String[] args)
	{
		// creating scanner class to read input from the keyboard. 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter The Even Numbers :-");
		int n = sc.nextInt();
		
		// creating EvenNumberSum1TOn object to call num method.
		EvenNumberSum1TOn en1 = new EvenNumberSum1TOn();
		en1.num(n);
	}
}