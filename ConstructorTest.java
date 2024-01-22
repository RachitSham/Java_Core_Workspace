import java.util.*;
/*
*Write a program to print no of object created for a class.
*/
class ConstructorTest
{
	static int count = 0;
	{
		//instance block job you can't replace with constructor or constructor job you can't replace with instance block .
		//creating instance block.
		count++;
	}
	ConstructorTest()
	{
		System.out.println("This is First Constructor");
	}
	ConstructorTest(int i)
	{
		System.out.println("This is Second Constructor");
	}
	ConstructorTest(double d)
	{
		System.out.println("This is Thrid Constructor");
	}
	public static void main(String[] args)
	{
		ConstructorTest ct1 = new ConstructorTest();
		ConstructorTest ct2 = new ConstructorTest(110);
		ConstructorTest ct3 = new ConstructorTest(11.5);

		System.out.println("The No Of Object Created:" +count);
	}
}