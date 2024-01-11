import java.util.*;
/*
*To print the table.
*/
public class Table
{
	/*
	*this method is used to print the table.
	*@Parameter : [s] is used for starting table number.
	*@Return : no return type.
	*/
	public void number(int s)
	{
		for(int i=1 ;i<=10 ;i++)
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
		Table t1 = new Table();
		t1.number(s);
	}
}