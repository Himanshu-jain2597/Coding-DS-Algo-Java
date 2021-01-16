 // for any string the number of subsequence of the string is 2^n ..  = n is length of the string (including empty string)
 
 //order also matters in the case of subsequence
 
 // for ex: - for abc ac is a subsequence but ca is not a subsequence. cab is not a subsequence. 
 
 // substring of string "c" at str.substring(1) = ""(empty string)
 
 
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
	    ArrayList<String> arr = ss(str);
	    for(String s:arr) {
	        System.out.println(s);
	    }
	}
	public static ArrayList<String> ss(String str) {
	    if(str.length()==0) {
	        ArrayList<String> base = new ArrayList<>();
	        base.add("");
	        return base;
	    }
	    
	    char cc = str.charAt(0);
	    String ros = str.substring(1);
	    ArrayList<String> res = new ArrayList<>();
	    ArrayList <String> rec = ss(ros);
	    for(int i=0;i<rec.size();i++) {
	        res.add(rec.get(i));
	        res.add(cc+rec.get(i));
	    }
	    return res;
	}
	    
	
}

 
 
 
 
 
