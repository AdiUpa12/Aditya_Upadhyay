package javastart;

public class ConstructorConcept
{
	public ConstructorConcept()
	{
		this(23,45,67);
		System.out.println("Default Method");
	}
	public ConstructorConcept(int a)
	{
		this();
		System.out.println("1 Parameterized Method");
	}
	public ConstructorConcept(int a,int b)
	{
		this(67,45,67,56);
		System.out.println("2 Parameterized Method");
	}
	public ConstructorConcept(int a,int b, int c)
	{
		System.out.println("3 Parameterized Method");
	}
	public ConstructorConcept(int a,int b, int c,int d)
	{
		this(68);
		System.out.println("4 Parameterized Method");
	}
	public static void main(String[] args) 
	{
		ConstructorConcept obj=new ConstructorConcept(2,5);
	}
}
