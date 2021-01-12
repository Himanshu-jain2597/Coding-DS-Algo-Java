/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    IncreasingOrder(n);
	}
	
	public static void IncreasingOrder(int n) {
	    
	    if(n==0) {
	        return;
	    }
	    IncreasingOrder(n-1);
	    System.out.println(n);
	}
	
    
}
