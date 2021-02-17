// Java program to illustrate the fact that 
// runtime polymorphism cannot be achieved 
// by data members 

// class A 
class A 
{ 
	int x = 10; 
} 

// class B 
class B extends A 
{ 
	int x = 20; 
} 

// Driver class 
public class Test 
{ 
	public static void main(String args[]) 
	{ 
		A a = new B(); // object of type B 

		// Data member of class A will be accessed 
		System.out.println(a.x); 
	} 
} 

In above program, both the class A(super class) and B(sub class) have a common variable ‘x’. 
Now we make object of class B, referred by ‘a’ which is of type of class A. 
Since variables are not overridden, so the statement “a.x” will always refer to data member of super class.
