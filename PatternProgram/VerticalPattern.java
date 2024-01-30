/*
*To Print the Vertical Pattern.
*/
public class VerticalPattern
{
	public void pattern(){
		for(int i=1; i<=5; i++){
			System.out.println(" * ");
		}
	}
	public static void main(String[] args)
	{
	
	// creating object for VerticalPattern class.
		VerticalPattern pv = new VerticalPattern();
		pv.pattern();
	}
}
