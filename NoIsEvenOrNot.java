import java.util.*;
/*
** Check No Is Even Or Not.
*/
class NoIsEvenOrNot
{
	/*
	*this method is to check the no is even or not.
	*@Parameter: n is a any positive no.
	*@return: no return type
	*/
	public void isEven(int n)
	{
		if(n%2==0)
		{
			System.out.println("The No Is Even Say ! Har Har MahaDev.");
		}
		else{
			System.out.println("The No Is Not Even Say ! Jai Shree Ram.");
		}
	}
	
	public static void main(String[] args)
	{
	//Creating scanner class to read input from keyboard.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter The Even Numbers :-");
		int n = sc.nextInt();
		
		//cretaing object for NoIsEvenOrNot class
		NoIsEvenOrNot nw1 = new NoIsEvenOrNot();
		
		//calling isEven method in main method. 
		nw1.isEven(n);
	}
}