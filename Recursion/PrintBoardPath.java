                                                                curr, ans
                                                                0    , ""
                                                                
                                    
                            1,1                 2,8       3,7                4,6            5,5                6,4
                            
             
    2,"11"   3,"12"   4,13  5,"14"  6,"15"  7,"16"
    
    
    
    /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	    getboardpath(0,10,"");    
	    
	}
	
	public static void getboardpath(int curr,int end, String ans ) {
	    if(curr>end) {
	        return;
	    }
	    
	    if(curr==end) {
	        System.out.println(ans);
	        return;
	    }
	    for(int dice=1;dice<=6;dice++) {
	        getboardpath(curr+dice,end,ans+dice);
	    }
	}
	
}
