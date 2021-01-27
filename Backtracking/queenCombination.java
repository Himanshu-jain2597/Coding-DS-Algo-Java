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
	    queenCombination(new boolean[4],0,2,"",-1);
	    
		// your code goes here
	}
	
	public static void queenCombination(boolean[] boxes,int qpsf,int tq, String ans,int lastBoxUsed) {
	    
	    if(qpsf == tq) {
	        count++;
	        System.out.println(count + "." + ans);
	        return;
	    }
	    for(int i=lastBoxUsed+1;i<boxes.length;i++) {
	        if(boxes[i]==false) {
	        boxes[i] = true;
	        queenCombination(boxes,qpsf+1,tq,ans + "q" + qpsf+"b" + i+" ",i);
	        boxes[i] = false;
	        }
	        
	    }
	}
}
