                                                                        (0,0) , ""
                                                                        
                                                                        
                    (0,1) ,"H"
                    
                    
         (0,2) ,  "HH"
         
  (1,2)  , "HHV"
       
(2,2), "HHVV" 




/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	    getboardpath(0,0,2,2,"");    
	    
	}
	
	public static void getboardpath(int cr,int cc,int er,int ec,String ans ) {
	    if(cr>er||cc>er) {
	        return;
	    }
	    
	    if(cr==er&&cc==ec) {
	        System.out.println(ans);
	        return;
	    }
	    getboardpath(cr+1,cc,er,ec,ans+"V");
	    getboardpath(cr,cc+1,er,ec,ans+"H");
	}
	
}
