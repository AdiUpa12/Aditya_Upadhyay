package javastart;

public class Calculation 
{
	public int sum(int a, int b) 
	{
		int c=a+b;
		return c;
	}
	public int sub(int x, int y)
	{
	   int z=x-y;
	   return z;
	}
	public void multi(int q1, int q2) 
	{
		int q3;
	    q3 = q1*q2;
		System.out.println("Multiplication = " +q3);
	}
	public static void main(String[] args) 
	{
		Calculation Calc = new Calculation();
		int D = Calc.sum(50, 20);
		int E = Calc.sub(5, 3);
		Calc.multi(D, E);
	}
	
}
