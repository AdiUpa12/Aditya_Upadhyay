package conceptOOPS;

import java.util.Scanner;

public class Prime
{ int temp = 0;
	public void PrimeBlock()
	{
		System.out.println("Enter the Number : ");
		Scanner ob = new Scanner(System.in);
		int num = ob.nextInt();
		if (num<2)
		{
			System.out.println("Entered Number is not Prime");
		}
		else {
		for (int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				temp = temp+1;
			}
		}
			if (temp>0)
			{
				System.out.println("Entered number is Not Prime");
			}
			else 
			{
				System.out.println("Enetered Numer is Prime");
			}
	}	
	}
	public static void main(String[] args) 
	{
		Prime ob = new Prime();
		ob.PrimeBlock();
	}
}
