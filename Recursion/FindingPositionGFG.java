/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int count =0;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t>0) {
		    int n = sc.nextInt();
		    int ans = res(n);
		    System.out.println(ans);
		    t--;
		    
		}
	}
	
	public static int  res(int n ) {
	    
	    if(n>=2&&n<=3) {
	        return 2;
	    }
	    
	    return 2*res(n/2);
	    
	}
}
