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
	    queenPermuation(new boolean[4],0,2,"");
	    
		// your code goes here
	}
	
	public static void queenPermuation(boolean[] boxes,int qpsf,int tq, String ans) {
	    
	    if(qpsf == tq) {
	        count++;
	        System.out.println(count + "." + ans);
	        return;
	    }
	    for(int i=0;i<boxes.length;i++) {
	        if(boxes[i]==false) {
	        boxes[i] = true;
	        queenPermuation(boxes,qpsf+1,tq,ans + "q" + qpsf+"b" + i+" ");
	        boxes[i] = false;
	        }
	        
	    }
	}
}
