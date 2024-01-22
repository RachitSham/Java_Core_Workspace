import java.util.*;
/* 
*To create the Constructor to initalization of object. 
*/
class ConstructorDemo
{
	String name;
	int rollNo;
	
	//createing the constructor and the syntac is always fixed.
	ConstructorDemo(String name, int rollNo)
	{
		this.name = name;
		this.rollNo = rollNo;
	}
	public static void main(String[] args)
	{
		//to perform the initalization of the object.
		ConstructorDemo cd = new ConstructorDemo("Durga", 101);
		ConstructorDemo cd1 = new ConstructorDemo("Ravi", 102);
		ConstructorDemo cd2 = new ConstructorDemo("Shiva", 103);
		
	}
}