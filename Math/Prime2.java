/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int div =2;
	    int fact=0;
	    while(div<=n/2) {
	        if(n%div==0) {
	            fact= fact+1;
	            break;
	        }
	        div =div+1;
	    }
	    if(fact==1) {
	        System.out.println("not prime");
	    }
	    else {
	        System.out.println("prime");
	    }
		// your code goes here
	}
}
