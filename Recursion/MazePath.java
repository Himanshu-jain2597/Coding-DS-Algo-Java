/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   
	    ArrayList<String> arr = getMazePath(0,0,2,2);
	    System.out.println(arr);
	    
	}
	public static ArrayList<String> getMazePath(int cr,int cc,int er,int ec) {
	  if(cr>er||cc>ec){
	      ArrayList<String> base = new ArrayList<>();
	      return base;
	  }
	  if(cr==er&&cc==ec) {
	      ArrayList<String> base = new ArrayList<>();
	      base.add("");
	      return base;
	  }
	  ArrayList<String> res = new ArrayList<>();
	  ArrayList<String> recmaze = getMazePath(cr+1, cc,  er, ec);
	  for(int i=0;i<recmaze.size();i++) {
	      res.add('V'+recmaze.get(i));
	  }
	  ArrayList<String> rechmaze = getMazePath( cr, cc+1,  er, ec);
	    for(int i=0;i<rechmaze.size();i++) {
	      res.add('H'+rechmaze.get(i));
	  }
	  return res;
	}
	    
	
}
