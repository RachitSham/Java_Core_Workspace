import java.util.*;
/*
*To print all natural numbers in reverse .
*/
public class NaturalNumbersReverse
{
	/*
	*this method is used to print all natural numbers in Reverse .
	*@Parameter : [s] is used for s starting natural number , and [n] is used for ending natural number.
	*@Return : no return type.
	*/
	public void natural(int s , int n)
	{
		while(s >= n)
		{
			System.out.println(s);
			s--;
		}
	}
	public static void main(String[] args)
	{
		// creating Scanner class to read input from keyboard.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter The Starting Integer Number :-");
		int s = sc.nextInt();
		
		System.out.println("Please Enter The Ending Integer Number :-");
		int n = sc.nextInt();
		
  		// creating Natural Numbers Reverse objects to call natural method.
		NaturalNumbersReverse nm1 = new NaturalNumbersReverse();
		nm1.natural(s,n);
	}
}