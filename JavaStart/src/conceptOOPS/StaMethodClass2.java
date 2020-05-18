package conceptOOPS;

public class StaMethodClass2 
{
	public static void Method4()
	{
		System.out.println("Static Method 4 in Same Class");
	}
	public static void Method5()
	{
		System.out.println("Static Method 5 in Same Class");
	}
	public void Method6()
	{
		this.Method4();//Calling Static Method from Non-Static Method
		this.Method5();
		System.out.println("Static Method 6 in Same Class");
	}
	 public static void main(String[] args) 
	 { 
		 StaMethodClass.Method1();
		 StaMethodClass.Method2();
		 StaMethodClass ob = new StaMethodClass();
		 ob.Method3();
		 StaMethodClass2 Ob1 = new StaMethodClass2();
		 Ob1.Method6();  
	 }
}
