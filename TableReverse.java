import java.util.*;
/*
*To print the table reverse.
*/
public class TableReverse
{
	/*
	*this method is used to print the table reverse.
	*@Parameter : [s] is used for starting table number.
	*@Return : no return type.
	*/
	public void reverse(int s)
	{
		for(int i=10 ;i>=1 ;i--)
		{
		 int r = s*i;
		 System.out.println(s+" * " + i +" = "+r);
		}
			
	}
	public static void main(String[] args)
	{
		// creating Scanner class to read input from keyboard.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter The Starting table Number :-");
		int s = sc.nextInt();
		
  		// creating table objects to call natural method.
		TableReverse tr1 = new TableReverse();
		tr1.reverse(s);
	}
}
