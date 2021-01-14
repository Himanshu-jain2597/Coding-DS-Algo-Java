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
	    int[] arr1 = OccuranceArray(arr,4,0,0);
	    for(int i=0;i<arr1.length;i++) {
	        System.out.println(arr1[i]);
	    }
	    
	}
	public static int[] OccuranceArray(int arr[],int element,int si,int  count) {
	    if(si==arr.length) {
	        int [] base = new int[count];
	        return base;
	    }
	    int [] indices = null;
	    if(arr[si]==element) {
	        count=count+1;
	        indices = OccuranceArray(arr,element,si+1,count);
	        indices[count-1] = si;
	    } 
	    else {
	        indices = OccuranceArray(arr,element,si+1,count);
	    }
	    return indices;
	}
	
}
