package javastart;

import java.util.Scanner;

public class Palindrome 
{
	int r;
	int Sum;
	int Temp; 
	public void Method(int num)
	{   Temp=num;
		while(num>0)
		{
			r = num%10;
			Sum = (Sum*10)+r;
			num=num/10;
		}
		if(Temp==Sum)
		{
			System.out.println("Entered Number is Palindrome");
		}
		else
		{
			System.out.println("Entered Number is Not Palindrome");
		}
	}
		public static void main(String[] args) 
		{
			Palindrome ob = new Palindrome();
			System.out.println(".....Enter the number to check palindrome or not !.....");
			Scanner S = new Scanner(System.in);
			int num = S.nextInt();
			ob.Method(num);	
		}
	}
	
	
	
	
	
	
	


