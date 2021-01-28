/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    int [] demos = {2,3,5,6};
	    coinChange(demos,0,10,"");
		// your code goes here
	}
	public static void coinChange(int [] demos,int vindex,int amount,String ans) {
	    if(amount==0) {
	        System.out.println(ans);
	        return;
	    }
	    if(amount<0||vindex==demos.length) {
	        return;
	    }
	    
	    
	    coinChange(demos,vindex,amount-demos[vindex],ans+demos[vindex]);
	    coinChange(demos,vindex+1,amount,ans);
	}
}
