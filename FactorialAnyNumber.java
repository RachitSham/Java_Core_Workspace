import java.util.*;
/*
*To find the factorial value of any number
*/
public class FactorialAnyNumber
{
	/*
	*this method is used to find factorial of any no.
	*@Parameter :[n] is used from where you want to factorial of any no.
	*@return : no return type.
	*/
	public void factorial(int num)
	{
		int fact = 1;
		for(int i=1; i<=num; i++)
		{
			fact *= i;
		}
		System.out.println("Please Enter Factorial Number :-" +fact);
	}
	public static void main(String[] args)
	{
		//creating scanner class to read input fron keyboard.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter The Number :-");
		int num = sc.nextInt();
		
		//creating Factorial any number to call factorial method.
		FactorialAnyNumber fn1 = new FactorialAnyNumber();
		fn1.factorial(num);
	}
}