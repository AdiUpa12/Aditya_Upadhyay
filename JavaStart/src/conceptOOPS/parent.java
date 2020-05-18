package conceptOOPS;

public class parent 
{
	public parent() 
	{
		this(22,4,4,3);
		System.out.println("Parent Default Condstructor");
	}
	public parent(int a) 
	{
		this(2,5);
		System.out.println("Parent 1 Parameterized Condstructor");
	}
	public parent(int a, int b) 
	{
		this();
		System.out.println("Parent 2 Parameterized Condstructor");
	}
	public parent(int a, int b, int c) 
	{
		this (4);
		System.out.println("Parent 3 Parameterized Condstructor");
	}
	public parent(int a, int b, int c, int d) 
	{
		System.out.println("Parent 4 Parameterized Condstructor");
	}	
}