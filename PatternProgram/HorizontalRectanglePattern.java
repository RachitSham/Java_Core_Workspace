/*
*To Print the Horizontal Rectangle pattern.
*/
public class HorizontalRectanglePattern
{
	public void demo(){
		for(int i=1; i<=2;i++){
			
			for(int j=1; j<=3;j++){
				System.out.print(" * ");
			}
				System.out.println();
		}
	}
	public static void main(String[] args)
	{
	
		// creating object for Horizontal Rectangle class.
		HorizontalRectanglePattern hrp = new HorizontalRectanglePattern();
		hrp.demo();
	}
}