package javastart;

public class Student 
{
	int age;
	int Roll_No; 

public void Display1() 
	{
	   System.out.println("Welocome to All of You");
	}
public void Display2()
    {
	   System.out.println("Automation is Very Easy");
	}
public static void main(String[] args) 
    {
	   Student Deepak = new Student();
	   Deepak.age=26;
	   System.out.println(Deepak.age);
	   Deepak.Roll_No=7;
	   System.out.println(Deepak.Roll_No);
	   Deepak.Display1();
	   Deepak.Display2();

    }


}

