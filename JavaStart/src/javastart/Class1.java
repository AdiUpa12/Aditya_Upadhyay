package javastart;

public class Class1 
{
	int a;
	int b;
	
public void display1() 

{
	System.out.println("Welcome to the Page");
	
}

public void display2() 
{
System.out.println("Selennium Is good");	
}

	public static void main(String[] args) 
	{
		Class1 Adi = new Class1();
		Adi.display1();
		Adi.a=36;
		Adi.display2();
		System.out.println("Value of a = " +Adi.a);
		Adi.b=45;
		System.out.println("Value of b = " +Adi.b);

	}
	
}
