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
	    IncreasingDecreasingOrder(n);
	}
	
	public static void IncreasingDecreasingOrder(int n) {
	    
	    if(n<=0) {
	        return;
	    }
	    if(n%2==1)
	    System.out.println(n);
	    IncreasingDecreasingOrder(n-1);
	    if(n%2==0)
	    System.out.println(n);
	}
	
    
}
