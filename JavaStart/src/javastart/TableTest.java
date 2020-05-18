package javastart;

import java.util.Scanner;

public class TableTest 
{
	public static void Method()
	{
		System.out.println(": Enter the Number for which user wants to print the Table : ");
		Scanner S = new Scanner(System.in);
		int num = S.nextInt();
		for (int i=1; i<=10;i++)
		{
			int T = i*num;
			System.out.println(num + " X " + i + " = " +T);
		}
	}
	public static void main(String[] args) 
	{
		Method();
	}
}
