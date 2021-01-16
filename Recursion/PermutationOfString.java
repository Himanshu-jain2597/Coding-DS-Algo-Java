// permuation basically means arrangements of string for ex:- abc can be arranged in abc , acb, cba etc etc.  


// if string is of length n then total n! permuation is poosible. 

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
	    String str = sc.next();
	
	    ArrayList<String> arr = getPermuation(str);
	    for(String s:arr) {
	        System.out.println(s);
	    }
	}
	public static ArrayList<String> getPermuation(String str) {
	    if(str.length()==0) {
	        ArrayList<String> base = new ArrayList<>();
	        base.add("");
	        return base;
	    }
	    char cc = str.charAt(0);
	    String ros = str.substring(1);
	    ArrayList <String> rec = getPermuation(ros);
	    ArrayList<String> res = new ArrayList<>();
	    for(String recString:rec) {
	       for(int j=0;j<=recString.length();j++) {
	           String resd = recString.substring(0,j) + cc + recString.substring(j);
	           res.add(resd);
	       }
	    }
	    return res;
	}
	    
	
}
