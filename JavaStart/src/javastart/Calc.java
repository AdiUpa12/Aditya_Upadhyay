package javastart;

public class Calc 
{ // Equation - (((((10+2)-2)+2)*2)/2)
	public int Add (int a,int b)
	{  
		int c;
		c=a+b;
		System.out.println("Result of Addition = " +c);
		return c; 
		
	}
	public int Sub (int d ,int e)
	{ 
		int f;
		f=d-e;
		System.out.println("Result of Subtraction = " +f);
		return f; 
	}
	public int Multi (int g, int h)
	{
		int i;
		i=g*h;
		System.out.println("Result of Multiplication = " +i);
		return i;
	}
	public void Divi (int j, int k)
	{
		int l;
		l=j/k;
		System.out.println("Result of Division = " +l);
		System.out.println("Final Result of equation = " +l);
	}
	public static void main(String[] args) 
	{
		Calc ob = new Calc();
		int A1 = ob.Add(10,2);
		int S1 = ob.Sub(A1, 2);
		int A2 = ob.Add(S1,2);
		int M1 = ob.Multi(A2,2);
		ob.Divi(M1,2);
	}
}
	
	
	

