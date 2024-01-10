


import java.util.*;
/*
* Reactangle 
*/
class AreaOfTriangle
{
	/*
	* this method to find area of triangle
	* @parameter: b is breath and h is height
	* @return: no return type
	*/
	public void area(int b , int h)
	{
		int a = b * h/2;
		System.out.println("Area Reactangle: " + a);
	}
	
	//we are calling area method in the main class.
	public static void main(String[] args)
	{
	// creating scanner class Read Input From keyboard.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter The Numbers for Breath: ");
		int b = sc.nextInt();
		
		System.out.println("Please Enter The Numbers for Height: ");
		int h = sc.nextInt();
		
		//Creating Object For AreaOfTriangle class.
		AreaOfTriangle rt1 = new AreaOfTriangle();
		
		rt1.area(b,h);
	}
}
