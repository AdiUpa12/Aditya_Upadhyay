package conceptOOPS;

public class Overriding_C_Class extends Overriding_P_Class
{
	public void Method1(int a, int b)
	{
		int c;
		c = a-b; 
		System.out.println("The Substraction of Two Digits = " +c);
	}
	public static void main(String[] args) 
	{
		Overriding_C_Class ob = new Overriding_C_Class();
		ob.Method1(3, 1); 
		Method2(5,2);
		// Method Present in Parent but not in Child Class
	}

}
