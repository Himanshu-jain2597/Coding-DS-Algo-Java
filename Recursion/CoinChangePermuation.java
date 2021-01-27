/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int count =0;
	public static void main (String[] args) throws java.lang.Exception
	{
	    int [] demos = {2,3,5,6};
	    coinChange(demos,10,"");
	    
		// your code goes here
	}
	
	public static void coinChange(int[] demos,int amount, String ans) {
	    
	    if(amount==0) {
	        System.out.println(ans);
	        return;
	        
	    }
	    
	    for(int i=0;i<demos.length;i++) {
	        if(amount>=demos[i]) {
	        
	        coinChange(demos,amount-demos[i],ans+demos[i]);
	        }
	        
	    }
	    

	}
}
