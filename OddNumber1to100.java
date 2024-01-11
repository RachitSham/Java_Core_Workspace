import java.util.*;
/*
*To print all odd number between 1 to 100
*/
public class OddNumber1to100
{
	/*
	*this method is used to print all odd number between 1 to 100
	*@Parameter :[n] is used from where you to print odd numbers.
	*@return : no return type
	*/
	public void num(int n)
	{
		for(int i=1; i<=n; i++){
			if(i%2==1)
			{
			System.out.println(i);	
			}
		}
	}
	public static void main(String[] args)
	{
		//creating scanner class to read input from keyboard.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the Numbers :-");
		int n = sc.nextInt();
		
		//creating OddNumber1to100 object to call num method.
		OddNumber1to100 od1 = new OddNumber1to100();
		od1.num(n);
	}
} 