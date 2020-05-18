package javastart;

public class Equation 
{ // ((((10/2)-2)+2)+2)*2)
	public int Add (int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Result of Addition = " +c);
		return c;
	}
	public int Sub (int d, int e)
	{
		int f;
		f=d-e;
		System.out.println("Result of Subtraction = " +f);
		return f;
	}
	public void Multi (int g, int h)
	{
		int i;
		i=g*h;
		System.out.println("Result of Multiplication = " +i);
		System.out.println("Final Result of Equation = " +i);
	}
	public int Divi (int j, int k)
	{
		int l;
		l=j/k;
		System.out.println("Result of Division = " +l);
		return l;
	}
	public static void main(String[] args) 
	{
		Equation ob = new Equation ();
		int D1 = ob.Divi(10, 2);
		int S1 = ob.Sub(D1, 2);
		int A1 = ob.Add(S1, 2);
		int A2 = ob.Add(A1, 2);
		ob.Multi(A2, 2);
	}

}
