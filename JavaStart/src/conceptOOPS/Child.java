package conceptOOPS;

public class Child extends parent 
{
	public Child() 
	{
		this(6,7,8);
		System.out.println("Child Default Condstructor");
	}
	public Child(int a) 
	{
		this(5,6,7,8);
		System.out.println("Child 1 Parameterized Condstructor");
	}
	public Child(int a, int b) 
	{
		this(6);
		System.out.println("Child 2 Parameterized Condstructor");
	}
	public Child(int a, int b, int c) 
	{
		super (4,6,7);
		System.out.println("Child 3 Parameterized Condstructor");
	}
	public Child(int a, int b, int c, int d) 
	{
		this();
		System.out.println("Child 4 Parameterized Condstructor");
	}	
	public static void main(String[] args) 
	{
		Child obj = new Child(7,8);	
	}
}	
