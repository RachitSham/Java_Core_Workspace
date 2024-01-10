import java.util.*;
/*
* Add Two Integer Numbers.
*/
class AddTwoInteger
{
	/*
	*this method is to add two integer no.
	*@parameter: a & b is to take integer values.
	*@return: no return type.
	*/
	public void add(int a,int b)
	{
		int c = a + b;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
	// creating scanner class to read input from keyboard
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please Enter The Numbers for integer a :- ");
		int a = sc.nextInt();
		
		System.out.println("please Enter The Numbers for integer b :- ");
		int b = sc.nextInt();
		
		System.out.println("Add the Two Integer Numbers :-");
		
		//creating object for AddTwoInteger class.
		AddTwoInteger ai1 = new AddTwoInteger();
		
		//calling add method in main method.
		ai1.add(a,b);
	}
}
