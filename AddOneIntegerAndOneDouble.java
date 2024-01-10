import java.util.*;
/*
** Add one integer no and one double no
*/
class AddOneIntegerAndOneDouble
{
	/*
	*this method is to add on integer no and one double no .
	*@parameter: [a] take one integer value and [b] take one double value
	*@return: no return type	
	*/
	public void add(int a,double b)
	{
		double d = a + b;
		System.out.println(d);
	}
	
	public static void main(String[] args)
	{
	//creating scanner class to read input from keyboard.
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" please enter One integer no :- ");
		int a = sc.nextInt();
		System.out.println(" please enter One double no :- ");
		int b = sc.nextInt();
		
		System.out.println("Numbers Added :-");
		
		//creating AddOneIntegerAndOneDouble object to call add method.
		
		AddOneIntegerAndOneDouble dm1 = new AddOneIntegerAndOneDouble();
		
		//calling add method in main method.
		dm1.add(a,b);
	}
}
