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
	    int [] arr = new int[n];
	    for(int i=0;i<n;i++) {
	        arr[i] = sc.nextInt();
	    }
	   arr =  mergeSort(arr,0,n-1);
	   for(int val:arr) {
	       System.out.println(val);
	   }
	}
	public static int[] mergeSort(int [] arr,int low,int high) {
	    if(low==high) {
	        int [] base = new int[1];
	        base[0] = arr[low];
	        return base;
	    } 
	    
	    int mid =  (low+high)/2;
	    
	    int[] fh = mergeSort(arr,low,mid);
	    int [] sh =  mergeSort(arr,mid+1,high);
	    
	    int [] merge = merge(fh,sh);
	    return merge;
	}
	public static int[] merge(int [] fh,int [] sh) {
	   int i=0;
	   int j=0;
	   int k=0;
	   int total = fh.length+sh.length;
	   int [] merge =  new int[total];
	   while(i<fh.length&&j<sh.length) {
	       if(fh[i]>=sh[j]) {
	            merge[k] = sh[j];
	            j++;
	       }
	       else {
	           merge[k] = fh[i];
	           i++;
	       }
	       k++;
	   }
	   while(i<fh.length) {
	       merge[k] = fh[i];
	       i++;
	       k++;
	   }
	   while(j<sh.length) {
	       merge[k] = sh[j];
	       j++;
	       k++;
	   }
	   return merge;
	}
}
