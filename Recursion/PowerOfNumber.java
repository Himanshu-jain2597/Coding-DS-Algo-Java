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
	    int n = sc.nextInt();
	    int x = sc.nextInt();
	    int po = pow(n,x);
	    System.out.println(po);
	    
	}
	public static int pow(int n,int x) {
	    if(x==0) {
	        return 1;
	    }
	    int d = pow(n,x-1);
	    int ans = n*d;
	    return ans;
	}
}
