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
	    System.out.println(arraySorted(arr,0));
	    
	}
	public static boolean arraySorted(int arr[],int si) {
	    if(si==arr.length-1) {
	        return true;
	    }
	    else if(arr[si]>arr[si+1]){
	        return false;
	    }
	    else {
	    return arraySorted(arr,si+1);
	    }
	}
	
}
