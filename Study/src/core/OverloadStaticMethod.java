package core;

public class OverloadStaticMethod  
{  
	public static void main(String args[])   
	{  
		ParentClass pc = new ChildClass1();  
		//calling display() method by parent class object  
		pc.display();   
	}   
}  
//parent class  
class ParentClass  
{  
	//we cannot override the display() method  
	public  void display()  
	{  
		System.out.printf("display() method of the parent class.");  
	}  
}  
//child class  
class ChildClass1 extends ParentClass  
{  
	//the same method also exists in the ParentClass  
	//it does not override, actually it is method hiding  
	public void display()  
	{  
		System.out.println("Overridden static method in Child Class in Java");  
	}  
}  