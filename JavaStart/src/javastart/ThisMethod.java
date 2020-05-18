package javastart;

public class ThisMethod 
{
	public void Method0()
	{
		this.Method3(6,8,8);
		System.out.println("Default Method");
	}
	public void Method1(int a)
	{
		this.Method0();
		System.out.println("1 Parameterized Method");
	}
	public void Method2(int a,int b)
	{
		this.Method4(2, 3, 4,9);
		System.out.println("2 Parameterized Method");
	}
	public void Method3(int a,int b, int c)
	{
		System.out.println("3 Parameterized Method");
	}
	public void Method4(int a,int b, int c,int d)
	{
		this.Method1(2);
		System.out.println("4 Parameterized Method");
	}
	public static void main(String[] args) 
	{
		ThisMethod obj=new ThisMethod();
		obj.Method2(2,4);
	}

}
