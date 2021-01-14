/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[]  arr = new int[5];
	    System.out.println(arr); // base address of array will be printed.
      
      	// print array with loop 
		  for(int i=0;i<arr.length;i++) {
		    System.out.println(arr[i]);
		}
    
    // enchance for loop  cannot print in reverse order 
		// this is read only cannot update value. 
		for(int val:arr) {
		    System.out.println(val);
		}
	}
}
