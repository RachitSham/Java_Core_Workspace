import java.util.*;
/*
* Print the Sum Of Even No Upto n.
*/
class SumOfEvenNumberUptoN
{
	/*
	*this method is to Print Sum Of Even No Upto n.
	*@parameter : it take will n integer value.
	*@return : no return type.
	*/
	public void even(int n)
	{
		int sum =0;
		for(int i= 1; i < n ; i++){
			if(i%2==0){
				sum = sum+i;
				System.out.println(sum);
			}
		}
	}
	public static void main(String[] args)
	{
		// creating scanner class to read input from keyboard.
		Scanner sc = new Scanner(System.in);
		System .out.println("Please Enter The Numbers :-");
		
		int n = sc.nextInt();
		
		// creating  SumOfEvenNumberUptoN object to call even method.
		SumOfEvenNumberUptoN se = new SumOfEvenNumberUptoN();
		se.even(n);
	}
}
