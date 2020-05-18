package patterns;

import java.util.Scanner;

public class Pattern2 
{
	public void Pat2()
	{
		System.out.println("..Enter the number of rows which you want to print..");
		Scanner S = new Scanner(System.in);
		int num = S.nextInt();
		for (int i=1;i<=num;i++)
		{
			for(int j =num; j>=i; j--)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Pattern2 P = new Pattern2();
		P.Pat2();
	}
}
