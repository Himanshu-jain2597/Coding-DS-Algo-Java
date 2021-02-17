// Static binding is done during compile-time while dynamic binding is done during run-time.
// private, final and static methods and variables uses static binding and bonded by compiler 
// while overridden methods are bonded during runtime based upon type of runtime object

//Dynamic Binding: In Dynamic binding compiler doesn’t decide the method to be called. 
//Overriding is a perfect example of dynamic binding. In overriding both parent and child classes have same method . Let’s see by an example


public class NewClass { 
    public static class superclass { 
        void print() 
        { 
            System.out.println("print in superclass."); 
        } 
    } 
  
    public static class subclass extends superclass { 
        @Override
        void print() 
        { 
            System.out.println("print in subclass."); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        superclass A = new superclass(); //print in superclass.
        superclass B = new subclass();  //print in subclass.
        A.print(); 
        B.print(); 
    } 
} 


//Output:

//print in superclass.
//print in subclass.
