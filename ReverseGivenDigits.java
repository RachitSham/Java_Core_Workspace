import java.util.*;
/*
*To reverse the given Digits
*/
public class ReverseGivenDigits
{
	/*
	*this method is used to reverse the given digit.
	*@Parameter :[num] is used to reverse the given digit.
	*@return : no return type.
	*/
	public void digit(int num)
	{
		int a = num; //initializes a variable a to num to store the original value of num
		int rev = 0;
		int rem = 0;
		
		while(num>0){
			rem = num %10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		System.out.println("Enter The Value :"+ a);
		System.out.println("Reverse value :"+ rev);
	}
	public static void main(String[] args)
	{
		// creating scanner class to read input from the keyboard.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Value :-");
		int num = sc.nextInt();
		
		// creating ReverseGivenDigits object to call digit method.
		ReverseGivenDigits rd1 = new ReverseGivenDigits();
		rd1.digit(num);
	}
}