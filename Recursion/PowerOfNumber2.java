/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   int ans =  power(2,5);
	   System.out.println(ans);
		// your code goes here
	}
	public static int power(int n,int pow) {
	    if(pow==0) 
	    return 1;
	    if(pow%2==1) {
	        int rec  = power(n,pow/2);
	        int ans = rec*rec*n;
	        return ans;
	    } 
	    else {
	        int rec = power(n,pow/2);
	        int ans = rec*rec;
	        return ans;
	    }
	
	}
}
