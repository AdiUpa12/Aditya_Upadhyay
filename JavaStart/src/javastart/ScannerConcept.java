package javastart;

import java.util.Scanner;

public class ScannerConcept 
{ //(((((x1+x2)-x3)+x4)*x5)/x6)
	
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sub (int a, int b)
	{
		int c;
		c=a-b;
		return c;
	}
	public int multi(int a, int b)
	{
		int c;
		c=a*b;
		return c;
	}
	public void divi(int a, int b)
	{
		int c;
		c=(a/b);
		System.out.println("Final Output of the Equation = " +c);
	}
	public static void main(String[] args) 
	{
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Value of X1 = ");
		int x1 = S.nextInt();
		System.out.println("Enter the Value of X2 = ");
		int x2 = S.nextInt();
		System.out.println("Enter the Value of X3 = ");
		int x3 = S.nextInt();
		System.out.println("Enter the Value of X4 = ");
		int x4 = S.nextInt();
		System.out.println("Enter the Value of X5 = ");
		int x5 = S.nextInt();
		System.out.println("Enter the Value of X6 = ");
		int x6 = S.nextInt();
		ScannerConcept ob = new ScannerConcept();
		int A1 = ob.sum(x1, x2);
		int Su= ob.sub(A1, x3);
		int A2 = ob.sum(Su, x4);
		int M = ob.multi(A2, x5);
		ob.divi(M, x6);	
	}
	
}
