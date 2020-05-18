package javastart;

import java.util.Scanner;

public class Armstrong 
	{
	int r; 
	int Temp;
	int cube;
	public void Method(int num)
	{
		Temp=num;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			cube = cube + (r*r*r);
		}
		if(Temp==cube)
		{
			System.out.println("Entered number is Armstrong number");
		}
		else
		{
			System.out.println("Entered number is Not Armstrong ");
		}	
	}
			public static void main(String[] args) 
			{
				Armstrong ob = new Armstrong();
				System.out.println("Enter the number to check Armstrong or not !");
				Scanner S = new Scanner(System.in);
				int num = S.nextInt();
				ob.Method(num);	
			}
}
