import java.util.*;
/*
*To sum of its Digits.
*/
public class SumOfItsDigits
{
	/*
	*this method is used to sum of its digit.
	*@Parameter :[num] is used to sum of its digit.
	*@return : no return type.
	*/
	public void digit(int num)
	{
		int a = num; //initializes a variable a to num to store the original value of num
		int sum = 0;
		int rem = 0;
		
		while(num>0){
			rem = num %10;
			sum = sum + rem;
			num /= 10;
		}
		System.out.println("Enter The Value :"+ a);
		System.out.println("Reverse value :"+ sum);
	}
	public static void main(String[] args)
	{
		// creating scanner class to read input from the keyboard.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Value :-");
		int num = sc.nextInt();
		
		// creating SumOfItsDigits object to call digit method.
		SumOfItsDigits sd1 = new SumOfItsDigits();
		sd1.digit(num);
	}
}