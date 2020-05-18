package patterns;

import java.util.Scanner;

public class Pattern3 
{
		public void Pat3() 
		{
			System.out.println("..Enter the number of rows which you want to print..");
			Scanner S = new Scanner(System.in);
			int num = S.nextInt();
			for (int i=1; i<=num; i++)
			{
				for(int j=1; j<=i;j++)
				{
					System.out.print(" "+ j + " ");
				}
				System.out.println();
			}
		}
		public static void main(String[] args) 
		{
			Pattern3 P = new Pattern3();
			P.Pat3();
		}
	}


