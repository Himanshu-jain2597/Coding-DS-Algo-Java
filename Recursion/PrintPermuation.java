 //  approch :- 
 for ex:- if given string is abc then 
 if a becomes part of ans .then we have to find the permuation on bc 
 and if b becomes part of ans then we have to find permuation on ac. 
 and if c becomes part of ans then we have to find permuation on ac. 
 
                                             abc, "" 
                                  
                        
                     bc, "a"                 ac, "b"                   ab,"c"
                       
         c,"ab"             b,"ac"            c "ba"    a,"bc"          b,"ca"      a, "cb"
         
       abc                   acb               bac          bca           cab          cba       
       
       
 /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    String str = "abc";
	    printPermuation(str,"");
		// your code goes here
	}
	public static void printPermuation(String str,String res) {
	    if(str.length()==0) {
	        System.out.println(res);
	        return;
	        
	    }
	    for(int i=0;i<str.length();i++) {
	        char ch =  str.charAt(i);
	        String ros = str.substring(0,i) + str.substring(i+1);
	        printPermuation(ros,res+ch);
	    }
	}
}
