/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   
	    ArrayList<String> arr = getBoardPath(0,10);
	    System.out.println(arr.size());
	    
	}
	public static ArrayList<String> getBoardPath(int curr,int end) {
	    if(curr>end) {
	        ArrayList<String> base = new ArrayList<>();
	        return base;
	    }
	     if(curr==end) {
	        ArrayList<String> base = new ArrayList<>();
	        base.add("");
	        return base;
	    }
	    ArrayList<String> res = new ArrayList<>();
	    for(int dice=1;dice<=6;dice++) {
	        ArrayList<String> rec = getBoardPath(curr+dice,end);
	        
	        for(int i=0;i<rec.size();i++) {
	            res.add(dice+rec.get(i));
	        }
	    }
	    return res;
	}
	    
	
}
