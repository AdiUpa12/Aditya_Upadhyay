package conceptOOPS;

public class OverloadingEx 
{ // Method Overloading
	public void Sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum of two digits = " +c);
	}
	public void Sum(int d, float e)
	{
		float f;
		f=d+e;
		System.out.println("Sum of two digits one int and one float = " +f);
	}
	public static void main(String[] args) 
	{
		OverloadingEx ob = new OverloadingEx();
		ob.Sum(34, 10.2F);
		ob.Sum(34, 2);
	}
}
