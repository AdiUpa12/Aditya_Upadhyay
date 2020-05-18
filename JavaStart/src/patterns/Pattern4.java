package patterns;

import java.util.Scanner;

public class Pattern4 
{   int count = 0;
	public void Pat4() 
	{
		System.out.println("..Enter the number of rows which you want to print..");
		Scanner S = new Scanner(System.in);
		int num = S.nextInt();
		for (int i=1; i<=num; i++)
		{
			for(int j=1; j<=i;j++)
			{
				count = count + 1;
				System.out.print(" " + count + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Pattern4 P = new Pattern4();
		P.Pat4();
	}
}
