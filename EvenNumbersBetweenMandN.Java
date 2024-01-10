import java.util.*;
/*
*To print between m and n even no.
*/
class EvenNumbersSumBetweenMandN
{
	/*
	*This method is to print the even number between m and n.
	*@parameter: [m] is used to take starting value and [n] is used to take last value.
	*@Return : no return type.
	*/
	public void number(int m, int n){
		for(int i=m; i<n ;i++){
			if(i%2==0){
			System.out.println(i);
			}
		}
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
		
		// creating evennobetween object to call number method.
		EvenNumbersSumBetweenMandN ns1 = new EvenNumbersSumBetweenMandN();
		ns1.number(m,n);
 	}
}
