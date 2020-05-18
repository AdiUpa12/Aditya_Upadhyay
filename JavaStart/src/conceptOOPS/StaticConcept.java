package conceptOOPS;

public class StaticConcept 
{ int a;

public void method() 
{
	a=a+1;
	System.out.println("Value of a = " +a);
}
public static void main(String[] args) 
{
	StaticConcept ob = new StaticConcept();
	ob.method();
	StaticConcept ob1  = new StaticConcept();
	ob1.method();

}

}
