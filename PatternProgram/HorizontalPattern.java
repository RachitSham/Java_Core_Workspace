import java.util.*;
/*	
*To Print the Horizontal Pattern.
*/
public class HorizontalPattern 
{
	public void message() 
	{
		System.out.println("Hello");
	}
	
	public void print()
	{
		for(int i=1 ;i<=5; i++)
		{
			System.out.print(" * ");
		}
	}
	public static void main(String[] args)
	{
	// creating Horizontal Pattern object to call message and print method.
	
		HorizontalPattern one = new HorizontalPattern();
		one.message();
		one.print();
	}	
}
