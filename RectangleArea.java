/*
*To calculate the Area Of Rectangle.
*/
public class RectangleArea
{
	/*
	*this method is used to calculate rectangle area.
	*Parameter: [l] is used for length of rectangle , and [w] is used for width of rectangle.
	*@return : no return type.
	*/
	public void area(int l, int w)
	{
		int a = l * w ;
		System.out.println(a);
	}
	public static void main(String[] args)
	{
	// creating RectangleArea object to call area method.
		RectangleArea ar = new RectangleArea();
		ar.area(56,48);
	}
}