package conceptOOPS;

public class ParentMethod 
{ 
	public void ParentM()
	{
		System.out.println("Parent Default Method");
	}
	public void ParentM(int a)
	{
		System.out.println("Parent 1 Parameterized Method");
	}
	public void ParentM(int a, int b)
	{
		System.out.println("Parent 2 Parameterized Method");
	}
	public void ParentM(int a, int b, int c)
	{
		this.ParentM(3, 4, 3, 1);
		this.ParentM();
		this.ParentM(6,5);
		this.ParentM(34);
		System.out.println("Parent 3 Parameterized Method");
	}
	public void ParentM(int a, int b, int c, int d)
	{
		System.out.println("Parent 4 Parameterized Method");
	}
}
