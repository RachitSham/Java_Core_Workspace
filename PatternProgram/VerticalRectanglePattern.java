/*
*To Print the Vertical Rectangle pattern.
*/
public class VerticalRectanglePattern
{
	public void test(){
		for(int i=1; i<=4;i++){
			
			for(int j=2; j<=3;j++){
				System.out.print(" * ");
			}
				System.out.println();
		}
	}
	public static void main(String[] args)
	{
	// creating object for vertical Rectangle pattern class.
		VerticalRectanglePattern vrp = new VerticalRectanglePattern();
		vrp.test();
	}
}