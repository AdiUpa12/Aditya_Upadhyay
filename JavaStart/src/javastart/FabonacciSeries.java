package javastart;

import java.util.Scanner;

public class FabonacciSeries 
{
	int a=0,b=1;
	
	public void Method (int num)
	{
		System.out.print(a+ " " +b);
		for (int i=1;i<=num;i++)
		{
			int c;
			c=a+b;
			System.out.print(" "  +c);
			a=b;
			b=c; 
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the number till that you want to Print Fabonacci Series");
		Scanner ob1 = new Scanner(System.in);
		int  num = ob1.nextInt();
		FabonacciSeries ob = new FabonacciSeries();
		ob.Method (num - 2);
	}

}
