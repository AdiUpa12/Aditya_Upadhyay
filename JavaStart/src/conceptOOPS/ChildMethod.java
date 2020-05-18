package conceptOOPS;

public class ChildMethod extends ParentMethod 
{
	public void ChildM()
	{
		System.out.println("Child Default Method");
	}
	public void ChildM(int a)
	{
		System.out.println("Child 1 Parameterized Method");
	}
	public void ChildM(int a, int b)
	{
		super.ParentM(5, 5, 7);
		this.ChildM(4,7,9);
		this.ChildM();
		this.ChildM(4,9,7,89);
		this.ChildM(6);
		System.out.println("Child 2 Parameterized Method");
	}
	public void ChildM(int a, int b, int c)
	{
		System.out.println("Child 3 Parameterized Method");
	}
	public void ChildM(int a, int b, int c, int d)
	{
		System.out.println("Child 4 Parameterized Method");
	}
	public static void main(String[] args) 
	{
		ChildMethod obj = new ChildMethod();
		obj.ChildM(6, 9);
	}
}