package conceptOOPS;

import java.util.Scanner;

public class Swap 
{// Swapping without using Third variable
	public static void main(String[] args) 
	{
		System.out.println("Enter the Value of A : ");
		Scanner Sc1 = new Scanner(System.in);
		int a= Sc1.nextInt();
		System.out.println("Enter the Value of B : ");
		Scanner Sc2 = new Scanner(System.in);
		int b = Sc2.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping the Value of A : " +a);
		System.out.println("\nAfter Swapping the Value of B : " +b);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
