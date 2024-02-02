import java.util.*;
/*
*to overload the constructor with same name but different parameter.
*/
class ConstructorOverloading
{
	//creating first constructor with no parameter.
	ConstructorOverloading()
	{
		this(10);
		System.out.println("no-arg method");
	}
	//creating second constructor with parameter.
	ConstructorOverloading(int i)
	{
		this(10.5);
		System.out.println("int-arg");
	}
	//creating thrid constructor with  parameter.
	ConstructorOverloading(double d)
	{
		System.out.println("double-arg");
	}
	public static void main(String[] args)
	{
		ConstructorOverloading co1 = new ConstructorOverloading();
		ConstructorOverloading co2 = new ConstructorOverloading(10);
		ConstructorOverloading co3 = new ConstructorOverloading(10.5);
		//automatic promotion data types in overloading.
		//output of this constructor is "double-arg".
		ConstructorOverloading co4 = new ConstructorOverloading(10l);
	}
}