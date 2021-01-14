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
	    int [] arr  =  new int[n];
	    for(int i=0;i<n;i++) {
	        arr[i] = sc.nextInt();
	    }
	    System.out.println(lastIndex(arr,4,0));
	    
	}
	public static int lastIndex(int arr[],int fi,int si) {
	    if(si==arr.length) {
	        return -1;
	    }
	    int index = lastIndex(arr,fi,si+1);
	    if(index ==-1) {
	        if(arr[si]==fi) {
	            return si;
	        }
	        else {
	            return -1;
	        }
	    }
	   else {
	       return index;
	   }
	}
	
}
