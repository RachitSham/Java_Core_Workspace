import java.util.*;
/*
*Difference of Sum of Even no and sum odd no between m and n.
*/
class DifferenceOfSumOfOddAndSumOfEven
{
	/*
	*This method is to add even and odd  number between m and n.
	*@parameter: [m] is used to take starting value and [n] is used to take last value.
	*@Return : no return type.
	*/
	public void Even(int m, int n){
		int sumeven = 0;
		int sumodd = 0;
		int sum = 0;
		for(int i=m; i<n ;i++){
			if(i%2==0){
				sumeven = sumeven+i;
			}
			if(i%2==1){
				sumodd = sumodd+i;
			}
		}
		 sum = sumeven-sumodd;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		// creating scanner class to read input from keyboard.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Value:-");
		
		System.out.println("Please Enter The Starting Value:-");
		int m = sc.nextInt();
		
		System.out.println("Please Enter The Ending Value :-");
		int n = sc.nextInt();
		
		System.out.println("______________________");
		
		// creating DifferenceOfSumOfOddAndSumOfEven object to call even method.
		DifferenceOfSumOfOddAndSumOfEven so1 = new DifferenceOfSumOfOddAndSumOfEven();
		so1.Even(m,n);
	}
}
