package patterns;

import java.util.Scanner;

public class Pattern1 
{
	public void Pat1() 
	{
		System.out.println("..Enter the number of rows which you want to print..");
		Scanner S = new Scanner(System.in);
		int num = S.nextInt();
		for (int i=1; i<=num; i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}

	}
	public static void main(String[] args) 
	{
		Pattern1 P = new Pattern1();
		P.Pat1();
	}

}
