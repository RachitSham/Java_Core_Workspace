import java.util.*;
/*
* Check The Number Is positive Or Negative .
*/
public class NumberIsPositiveOrNegative
{
	/*
	*this method is to check the number is positive or Negative.
	*@parameter : num take the integer value. 
	*@return : no return type.
	*/
	public void positive(int num)
	{
		if(num > 0)
		{
			System.out.println("The Number is positive"+ " ");
		}
		else if(num < 0){
			System.out.println("the Number Is Negative" + " ");
		}
		else{
			System.out.println("The Number Is Zero"+ " ");
		}
	}
	public static void main(String[] args)
	{
		// creating scanner class to read input from the keyboard.
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Please Enter The number :- ");
		int num = sc.nextInt();
	
		//creating NumberIsPositiveOrNegative object to call positive method.
		NumberIsPositiveOrNegative ps1 = new NumberIsPositiveOrNegative();
		
		// calling positive method in main method.
		ps1.positive(num);
	}
}
