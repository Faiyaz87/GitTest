package core;

public class OverloadStaticMethod2  
{  
	public static void main(String args[])   
	{  
		ParentClass1 pc = new ChildClass2();  
		//calling display() method by parent class object  
		pc.display();   
	}   
}  
//parent class  
class ParentClass1 
{  
	//we cannot override the display() method  
	public  void display()  
	{  
		System.out.printf("display() method of the parent class.");  
	}  
}  
//child class  
class ChildClass2 extends ParentClass1  
{  
	//the same method also exists in the ParentClass  
	//it does not override, actually it is method hiding  
	public void display()  
	{  
		System.out.println("Overridden static method in Child Class in Java");  
	}  
}  