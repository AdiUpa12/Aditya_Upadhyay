package javastart;

import java.util.Scanner;

public class FactorialTest 
{ static int fact = 1;
	public static void Method()
	{
		System.out.println("Enter the number for which factorial is required: \n" );
		Scanner S = new Scanner(System.in);
		int num = S.nextInt();
		if(num==0)
			System.out.println("\nFactorial of "+num+ " = " + fact + "\n");
		else   
		for (int i = 1 ; i<=num; i++)
		{
			fact = fact * i;
		}
		System.out.println("\nFactorial of "+num+ " = " +fact + "\n");
	}
	
	public static void main(String[] args) 
	{
		Method();
		Method();
	}
}
