import java.util.*;
/*
*To print between m and n even no and sum of that no.
*/
class SumOfEvenNumberBetweenMandN
{
	/*
	*sum of even no for given starting no and given ending no.
	*@parameter: [m] is used to take starting value and [n] is used to take last value.
	*@Return : no return type.
	*/
	public void between(int m, int n){
		int sum=0;
		for(int i=m; i<n ;i++){
			if(i%2==0){
				sum= sum+i;
			}
		}
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
		
		// creating SumOfEvenNumberBetweenMandN object to call between method.
		
		SumOfEvenNumberBetweenMandN nb1 = new SumOfEvenNumberBetweenMandN();
		nb1.between(m,n);
	}
}