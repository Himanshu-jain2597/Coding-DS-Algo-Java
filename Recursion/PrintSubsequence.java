/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    String res = "";
	    subSequences("abc",res);
		// your code goes here
	}
	public static void subSequences(String str,String result) {
	    if(str.length()==0) {
	        System.out.println(result);
	        return;
	    }
	    
	    char ch = str.charAt(0);
	    String ros = str.substring(1);
	    subSequences(ros,result);
	    subSequences(ros,result+ch);
	}
}
