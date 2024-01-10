import java.util.*;
/*
* Entered The Double By An User .
*/
public class InputFromKeyboardDoub
{
	public static void main(String[] args)
	{
	//creating scanner class to read input from keyboard .
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please Enter The Value double :-");
		double d = sc.nextDouble();
		
		System.out.println("You entered double value:- " + d);
	}
}